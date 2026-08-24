class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        if (n <= 0) return false;

        // Use a frequency array to count occurrences
        int[] count = new int[n + 1];

        for (int num : nums) {
            // Out of bounds numbers make the array invalid
            if (num < 1 || num > n) {
                return false;
            }
            count[num]++;
        }

        // Validate numbers 1 to n-1 appear exactly once
        for (int i = 1; i < n; i++) {
            if (count[i] != 1) {
                return false;
            }
        }

        // Validate that n appears exactly twice
        return count[n] == 2;
    }
}
