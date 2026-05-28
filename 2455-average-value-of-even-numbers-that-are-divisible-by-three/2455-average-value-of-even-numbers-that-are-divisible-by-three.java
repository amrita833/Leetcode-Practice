class Solution {
    public int averageValue(int[] nums) {
        int summ = 0;
        int count = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] % 6 == 0){
                summ += nums[i];
                count++;
            }
        }
        if(summ == 0){
            return 0;
        }
        return summ/count;
    }
}