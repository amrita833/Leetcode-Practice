class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>st=new HashSet<>();
        int n=candyType.length;
        int ans=n/2;
        for(int i=0;i<candyType.length;i++){
            st.add(candyType[i]);
        }
        int count=st.size();
        if(ans>=count){
            return count;
        }
        return ans;
    }
}