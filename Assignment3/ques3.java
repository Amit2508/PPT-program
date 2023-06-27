class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Find the first decreasing element from the right
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            // Find the next greater element to swap with
            int j = n - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            
            // Swap the elements
            swap(nums, i, j);
        }
        
        // Reverse the remaining elements
        reverse(nums, i + 1, n - 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
