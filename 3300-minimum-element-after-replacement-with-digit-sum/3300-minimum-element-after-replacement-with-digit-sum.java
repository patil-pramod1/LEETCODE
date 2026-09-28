class Solution {
    public int minElement(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int temp=nums[i]%10;
                min+=temp;
                nums[i]/=10;
            }
            nums[i]=min;
            min=0;
        }
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min2) min2=nums[i];
        }
        return min2;
    }
}