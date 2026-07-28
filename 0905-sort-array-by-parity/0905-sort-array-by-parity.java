class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                li.add(nums[i]);
        
            } 
            else{
                l2.add(nums[i]);
            }

            }
            li.addAll(l2);
            int ans[]=new int[li.size()];
            for(int i=0;i<li.size();i++){
                ans[i]=li.get(i);
            }
            return ans;
        
    }
}