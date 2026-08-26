class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>st=new HashSet<>();
        int n=nums.length;
        for(int arr:nums){
            st.add(arr);
        }
        for(int i=1;i<n+5;i++){
         int ans=k*i;
         if(!st.contains(ans)){
            return ans;
            
         }
        }
        return -1;
    }
}