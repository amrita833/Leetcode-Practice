class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        String s=Integer.toBinaryString(x);
        String s2= Integer.toBinaryString(y);
         while(s.length() < s2.length()) s = "0" + s;
        while (s2.length() < s.length()) s2 = "0" + s2;
        char[]ch=s.toCharArray();
        char[]ch2=s2.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch2[i]){
                count++;
            }
        }
        
          return count;  
        

        
    }
}