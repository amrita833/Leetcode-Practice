class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        
        for(int i=0;i<s.length();i++){
            HashSet<Character>st=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(st.contains(s.charAt(j))){
                    break;
                }
                
                    st.add(s.charAt(j));
                    
                
                
                maxlength=Math.max(maxlength,j-i+1);
                

            }
        }
        
        return maxlength;
        
    }
} 