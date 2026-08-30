class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxx=0;
        int minn=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxx])
            maxx=i;
            if(nums[i]<nums[minn])
            minn=i;

        }
        int begin=Math.max(maxx+1,minn+1);
        int end=n-Math.min(maxx,minn);
        int both=Math.min(maxx+1,minn+1)+n-(Math.max(maxx,minn));
        
        return Math.min(begin,Math.min(end,both));
        
    }
}