import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // The maximum product can either be the product of the three largest numbers or the product of the two smallest numbers and the largest number
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println(maxProduct);  // Output: 6
    }
}
