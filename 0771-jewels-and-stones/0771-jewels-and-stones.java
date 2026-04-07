class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char s1=jewels.charAt(i);
        for(int j=0;j<stones.length();j++){
            char s2=stones.charAt(j);
         if(s1==s2){
         count++;
        } 
         
        }}

    return count;
        
    }}
