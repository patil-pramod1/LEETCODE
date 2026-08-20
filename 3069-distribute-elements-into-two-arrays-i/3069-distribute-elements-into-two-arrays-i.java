class Solution {
    public int[] resultArray(int[] nums) {

        int[] result = new int[nums.length];
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int i = 1;
        int j = 1;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        if (arr1[0] > arr2[0]) {
            arr1[i++] = nums[2];
        } else {
            arr2[j++] = nums[2];
        }

        for (int k = 3; k < nums.length; k++) {

            if (arr1[i - 1] > arr2[j - 1]) {
                arr1[i++] = nums[k];
            } else {
                arr2[j++] = nums[k];
            }
        }

        int p = 0;
        int q = 0;

        for (int k = 0; k < result.length; k++) {

            while (p < arr1.length && arr1[p] == 0) {
                p++;
            }

            if (p < arr1.length) {
                result[k] = arr1[p++];
            } else {
                while (q < arr2.length && arr2[q] == 0) {
                    q++;
                }

                result[k] = arr2[q++];
            }
        }

        return result;
    }
}