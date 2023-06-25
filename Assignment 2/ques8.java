import java.util.Arrays;

public class MinScore {
    public static int minScore(int[] nums, int k) {
        int n = nums.length;
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Initialize the minimum and maximum values
        int minVal = nums[0];
        int maxVal = nums[n - 1];
        
        // Update the minimum and maximum values by considering the range [-k, k]
        minVal += k;
        maxVal -= k;
        
        // Calculate the minimum score
        int minScore = maxVal - minVal;
        
        // If the minimum score is negative, return 0
        if (minScore < 0) {
            return 0;
        }
        
        return minScore;
    }
    
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        
        int minScore = minScore(nums, k);
        System.out.println(minScore);  // Output: 0
    }
}
