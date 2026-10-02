class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(indices[i],s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            res.append(mp.get(i));
        }
        return res.toString();
    }
}