class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i]; // Found the smallest common element!
            } else if (nums1[i] < nums2[j]) {
                i++; // Move the pointer in nums1 because its value is too small
            } else {
                j++; // Move the pointer in nums2 because its value is too small
            }
        }
        
        return -1; // No common element found
    }
}
