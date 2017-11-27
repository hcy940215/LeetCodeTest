package array;


public class MovingZero {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        int[] a = moveZeroes(nums);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 数组01 - 0的移动 - 简单 - 283
     * <p>
     * 给定一个数组nums，写一个函数，将数组内的0移动到数组末尾，并保持其他非零元素在原数组中的相对位置不变。
     * <p>
     * 比如，给定nums = [0, 1, 0, 3, 12]，调用你的函数之后，nums应该变成[1, 3, 12, 0, 0]。
     * <p>
     * 注意：
     * <p>
     * 1. 请直接在传入的数组对象上修改，而不是另外创建一份拷贝（术语叫做 in-place，也有中译为“原地”）。
     * 2. 尽量减少操作指令代码的行数。
     *
     * @param nums
     * @return
     */
    public static int[] moveZeroes(int[] nums) {
        // Write your code here
        int fast = 0, slow = 0;
        int n = nums.length;

        while (fast < n) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        for (int i = slow; i < n; i++) {
            nums[i] = 0;
        }

        return nums;
    }

}
