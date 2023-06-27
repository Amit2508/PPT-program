import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        
        long start = lower;
        for (int num : nums) {
            if (num > start) {
                result.add(getRange(start, num - 1));
            }
            start = (long) num + 1;
        }
        
        if (start <= upper) {
            result.add(getRange(start, upper));
        }
        
        return result;
    }
    
    private String getRange(long start, long end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }
}
