class Solution {
    public int alternateDigitSum(int n) {
    String st=String.valueOf(n);
    int sum1=0;
    int sum2=0;
    for(int i=0;i<st.length();i++){
        int dig=st.charAt(i)-'0';
        if(i%2==0){
            sum1=sum1+dig;

        } else{
            sum2=sum2+dig;
        }}
        return sum1-sum2;
    }}
        
    
        
    
