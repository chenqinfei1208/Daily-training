package JavaHomeWork;
/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，
 * 并返回移除后数组的新长度。
 */

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 *
 * 内存消耗：37 MB, 在所有 Java 提交中击败了53.13%的用户
 *
 * 双指针解法，速度快得飞起，将数组中所有等于目标值的元素全部换到数组的最后面就OK了
 *
 * 尾指针从后往前，遇到一个值等于目标值的就前移一位；
 *
 * 头指针从前往后，遇到一个等于目标值的就将该元素和尾指针指向的元素交换位置，同时尾指针前移
 */
public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int lastIndex = nums.length - 1;
            for (int i=0; i<=lastIndex; i++) {
                while (lastIndex > i && nums[lastIndex] == val) { lastIndex--;}
                if (nums[i] == val) {
                    swap(nums, i, lastIndex);
                    lastIndex--;
                }
            }
            return lastIndex + 1;
        }

        public void swap(int [] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
