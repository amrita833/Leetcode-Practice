class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int put=0;
        for(int i=0;i<n;i++){
            put=put+(i/8)+1;

        }
        return put;
        
    }
}