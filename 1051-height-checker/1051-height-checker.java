class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int expected[]=heights.clone();
        for(int i=0;i<heights.length;i++){
    
        
        
     Arrays.sort(expected);
     if(heights[i]!=expected[i]){
        count++;
     }}
     return count;

}}