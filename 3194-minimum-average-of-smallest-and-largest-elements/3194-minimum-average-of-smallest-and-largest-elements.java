class Solution {
    public double minimumAverage(int[] nums) {
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        Arrays.sort(nums);
        ArrayList<Float>li=new ArrayList<>();
        int i=0;
        int j=nums.length-1;
        while(i<j){
            Float avg=(nums[i]+nums[j])/2.0f;
            li.add(avg);
            i++;
            j--;

        
        
        }
        return Collections.min(li);
        
    }
}