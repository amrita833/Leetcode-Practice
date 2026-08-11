class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>st=new HashSet<>();
        HashSet<Integer>st2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            st2.add(nums2[i]);
        }
        st.retainAll(st2);
          int[] result = new int[st.size()];
        int i = 0;
        for(int num : st){
            result[i++] = num;
        }
        
        return result;

        
    }
}