class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        // Entire array already has non-zero XOR
        if (xor != 0) {
            return nums.length;
        }

        // If total XOR is zero, remove one non-zero element.
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }

        // All elements are zero
        return 0;
    }
}