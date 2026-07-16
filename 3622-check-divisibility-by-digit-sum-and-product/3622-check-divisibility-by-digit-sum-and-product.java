class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        while(n>0){
            sum=sum+n%10;
            product=product*(n%10);
            n=n/10;
        }
        int total=sum+product;
        if(temp%total==0){
            return true;
        }
        
            return false;
        
    }
}