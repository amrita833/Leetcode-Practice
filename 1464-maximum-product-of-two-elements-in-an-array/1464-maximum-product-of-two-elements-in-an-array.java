class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);//2345
        int product1=nums[nums.length-1]-1;
        int product2=nums[nums.length-2]-1;
        return product1*product2;

        
    }
}