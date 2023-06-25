// I have done it on leetcode , so I am submitting that soln

public class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Move non-zero elements to their correct positions
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill remaining elements with zeroes
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
