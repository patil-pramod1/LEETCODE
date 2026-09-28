class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int i=0;
        int[] result=new int[s.length()];
        for(char c : s.toCharArray()){
            int temp=Character.getNumericValue(c);
            result[i]=temp;
            i++;
        }
        return result;
    }
}