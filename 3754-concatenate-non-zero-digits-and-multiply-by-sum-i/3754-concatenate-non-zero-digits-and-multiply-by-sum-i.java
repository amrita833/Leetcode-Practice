class Solution {
    public long sumAndMultiply(int n) {
        
        
        String s1=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch!='0'){
            sb.append(ch);


            } }
            long x = sb.length() == 0 ? 0 : Long.parseLong(sb.toString());
            long sum = 0;
        long temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        
        return x * sum;
        
    }
}