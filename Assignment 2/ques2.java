import java.util.HashSet;
import java.util.Set;

public class MaximumCandies {
    public static int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxEat = n / 2;
        
        // Create a set to keep track of unique candy types
        Set<Integer> uniqueCandies = new HashSet<>();
        
        // Count the number of unique candy types
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        // Return the minimum between the maximum eat limit and the unique candy types count
        return Math.min(maxEat, uniqueCandies.size());
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxCandies = maxCandies(candyType);
        System.out.println(maxCandies);  // Output: 3
    }
}
