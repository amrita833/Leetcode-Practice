class Solution {
    public int largestAltitude(int[] gain) {
        int start=0;
        int maxx=0;
        for(int i=0;i<gain.length;i++){
            start=start+gain[i];
           // if(start>max){
             //   max=start;}
             maxx=Math.max(maxx,start);

            
        }
        return maxx;
        
    }
}