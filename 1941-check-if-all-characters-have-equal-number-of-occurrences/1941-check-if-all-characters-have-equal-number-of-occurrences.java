class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        HashSet<Integer>st=new HashSet<>(mp.values());
        return st.size()==1;
        
    }
}