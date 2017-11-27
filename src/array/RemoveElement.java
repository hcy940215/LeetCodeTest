package array;


/**
 * 数组02 - 删除元素 - 简单 - 27
 * <p>
 * 给定一个数组和一个值，原地移除数组中所有给定的值，并返回新数组的长度。
 * <p>
 * 不允许申请额外空间，确保空间复杂度为O(1)。
 * <p>
 * 数组中的元素可以被改变，不用考虑超出新长度之后的空间遗留。
 * <p>
 * 比如：
 * <p>
 * 给定nums = [3, 2, ,2 3]， val = 3，
 * <p>
 * 你的函数应该返回length = 2， nums = [2, 2]。
 */
public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;

        int i = removeElement(nums, val);

    }

    public static int removeElement(int[] nums, int val) {
        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer2] = nums[pointer1];
                ++pointer2;
            }
            ++pointer1;
        }
        for (int i = 0; i < pointer2; i++) {
            System.out.println(nums[i]);
        }
        return pointer2;
    }
}
