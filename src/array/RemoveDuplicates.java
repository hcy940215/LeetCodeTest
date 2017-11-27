package array;

/**
 * 数组03 - 从有序数组中删除重复元素 - 简单 - 26
 * 给定一个有序数组，原地删除重复元素使得数组中的元素只保留一个，并且返回新长度。
 * 禁止申请额外空间，确保空间复杂度为O(1)。
 * 比如：
 * 给定nums = [1, 1, 2]，
 * 你的函数应该返回length = 2，nums = [1, 2]。
 * 不用考虑超出新长度之后的空间遗留。
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 5, 6};
        int i = removeDuplicates(nums);
        //System.out.println(i);

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pointer] = nums[i];
                ++pointer;
            }
        }

        for (int i = 0; i < pointer; i++) {
            System.out.println(nums[i]);
        }
        return 1;
    }
}
