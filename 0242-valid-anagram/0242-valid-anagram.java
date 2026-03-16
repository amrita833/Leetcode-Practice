class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> list=new ArrayList<>();
        ArrayList<Character> list2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        } for(int j=0;j<t.length();j++){
            list2.add(t.charAt(j));
        }
        list.sort(null);
        list2.sort(null);
        if(list.equals(list2)){
            return true;
        }else{
            return false;
        }

        

        
    }
}