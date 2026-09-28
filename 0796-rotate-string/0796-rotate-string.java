class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()) return false;
        boolean result = false;
        String temp = s+s;
        for(int i = 0;i<temp.length()-goal.length();i++){
            String temp2=temp.substring(i,goal.length()+i);
            if(temp2.equals(goal)){
                result=true;
            }
        }   
        return result;
    }
}