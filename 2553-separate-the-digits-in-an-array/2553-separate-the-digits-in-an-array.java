class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int[] result=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int temp=Integer.parseInt(s.charAt(i)+"");
            result[i]=temp;
        }
        return result;
    }
}