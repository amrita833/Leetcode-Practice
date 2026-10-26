class Solution {
    public int calculateScore(int a, int b) {
        int count1=0;
        int count2=0;
        String s1=Integer.toBinaryString(a);
        String s2=Integer.toBinaryString(b);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1'){
                count1++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='1'){
                count2++;
            }
        }
        if(count1>=count2){
            return count1*count2;
        }
        return count2/count1;
        
    }
}