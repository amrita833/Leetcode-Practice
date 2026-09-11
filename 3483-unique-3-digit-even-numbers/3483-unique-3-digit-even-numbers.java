class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        int n=digits.length;
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<n;i++){
            if (digits[i] == 0) continue;
            for(int j=0;j<n;j++){
            
                for(int k=0;k<n;k++){
                    if(i!=j&&j!=k&&k!=i){
                        if(digits[k]%2==0){
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        st.add(num);
                    
                    }
                }
            }
        }
        }
        return st.size();
        
    }
}