class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minn=Integer.MAX_VALUE;
        List<String> st=new ArrayList<>();

        for(int i=0;i<list1.length;i++){
    
         for(int j=0;j<list2.length;j++){
            if(list1[i].equals(list2[j])){
              int x=i+j;

              if(x<minn){
                st.clear();
                st.add(list1[i]);
                minn=x;
              } else if(x==minn){
                st.add(list1[i]);
              }
            }
            
         }
         }
return st.toArray(new String[st.size()]);
        
    }
}