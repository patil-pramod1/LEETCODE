class Solution {
    public int minimumCost(int[] cost) {
        int res=0;
        if(cost.length<=2) {
            for(int i=0;i<cost.length;i++) res+=cost[i];
            return res;
        }
        Arrays.sort(cost);
        int counter=0;
        for(int i=cost.length-1;i>=0;i--){
            if(counter==2){
                counter=0;
                continue;
            }
            res+=cost[i];
            counter++;
        } 
        return res;
    }
}