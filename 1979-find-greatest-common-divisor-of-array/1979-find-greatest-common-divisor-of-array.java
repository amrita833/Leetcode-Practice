class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        
           int num1=nums[0];
            int num2=nums[nums.length-1];
        
        return gcd(num1,num2);
        }


    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

        
    
    