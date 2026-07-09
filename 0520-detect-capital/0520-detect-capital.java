class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        int lower=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else{
                 lower++;
            }
        }
        if(upper==word.length()) return true;
        if(lower==word.length()) return true;
        if (upper == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
        
    }
}