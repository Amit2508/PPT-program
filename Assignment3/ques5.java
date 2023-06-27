class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i]++;
            
            // If the digit becomes 10, carry over the one to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // No more carry, so we can return the digits array
                return digits;
            }
        }
        
        // If we reach this point, it means all digits were 9 and got incremented to 0
        // We need to add an additional digit 1 at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
