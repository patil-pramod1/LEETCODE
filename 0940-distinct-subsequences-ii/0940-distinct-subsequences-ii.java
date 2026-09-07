class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;
        int total=0;
        int[] count=new int[26];

        for(char ch : s.toCharArray()){
            int index = ch-'a';

            int ot=total;

            int ns = (ot + 1-count[index]+MOD)%MOD;

            total =(total+ns)%MOD;

            count[index] = (count[index]+ns)%MOD;
        }
        return total;
    }
}