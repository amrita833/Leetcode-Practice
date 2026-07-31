 class Solution {
    public void duplicateZeros(int[] arr) {
      ArrayList<Integer> li= new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            li.add(arr[i]);
            if(arr[i]==0){
                li.add(0);
                
            }
         }
         for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
         }
        

    }
}