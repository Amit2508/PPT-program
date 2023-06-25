import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        int maxLength = 0;
        
        // Create a frequency map to count the occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Iterate over the frequency map and find the longest harmonious subsequence
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int subsequenceLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                maxLength = Math.max(maxLength, subsequenceLength);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLength = findLHS(nums);
        System.out.println(longestSubsequenceLength);  // Output: 5
    }
}
