class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int ans=0;
        Arrays.sort(arr);
        for(int num:arr){
            if(num>=ans+1){
                ans=ans+1;
            }
            else if(num<=ans+1){
                continue;
            }
        }
        return ans;
        
    }
}