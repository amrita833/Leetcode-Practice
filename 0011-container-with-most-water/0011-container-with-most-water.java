class Solution {
    public int maxArea(int[] height) {
        
        int maxx=Integer.MIN_VALUE;
        int p=0;
        int q=height.length-1;
        while(p<q){
            int area=Math.min(height[p],height[q])*(q-p);
            maxx=Math.max(maxx,area);
            if(height[p]<height[q]){
                p++;
            }
            else{
                q--;
            }
        }
    return maxx;

    }
}