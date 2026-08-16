class Solution {
    public boolean isPalindrome(String s) {
        String result=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String st=result.trim();
        int i=0;
        int j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

return true;
    
    }
}