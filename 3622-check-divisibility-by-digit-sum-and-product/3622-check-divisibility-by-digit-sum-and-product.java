class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 ;
        int product = 1;
        int orginal = n;
        while(n>0){
            int temp = n%10;
            n=n/10;
            sum+=temp;
            product*=temp;
        }

        sum+=product;
        if(orginal%sum==0) return true;
        
        return false;
    }
}