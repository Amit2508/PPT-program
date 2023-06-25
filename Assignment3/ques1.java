import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the sum of the first three elements
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Iterate over the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1; // Pointer to the element next to nums[i]
            int right = n - 1; // Pointer to the last element
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == target) {
                    // If the sum is equal to the target, return the sum
                    return sum;
                } else if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    // If the absolute difference between the current sum and target
                    // is smaller than the absolute difference between the closest sum and target,
                    // update the closest sum
                    closestSum = sum;
                }
                
                if (sum < target) {
                    // If the sum is less than the target, move the left pointer to the right
                    left++;
                } else {
                    // If the sum is greater than the target, move the right pointer to the left
                    right--;
                }
            }
        }
        
        return closestSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        
        int closestSum = threeSumClosest(nums, target);
        System.out.println(closestSum);  // Output: 2
    }
}
