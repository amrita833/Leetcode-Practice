class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        String st=String.valueOf(n);
        for(int i=0;i<st.length();i++){
            int digit=st.charAt(i)-'0';
            mp.put(digit,mp.getOrDefault(digit,0)+1);

        }
        for(int key:mp.keySet()){
            sum=sum+mp.get(key)*key;
            
        }
        return sum;

    }
}