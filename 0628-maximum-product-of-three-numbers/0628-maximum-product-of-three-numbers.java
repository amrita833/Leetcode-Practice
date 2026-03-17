class Solution {
    public int maximumProduct(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        } list.sort(null);
        int x1=list.get(n-1)*list.get(n-2)*list.get(n-3);
        int x2=list.get(0)*list.get(1)*list.get(n-1);
        return Math.max(x1,x2);
        
    }
}