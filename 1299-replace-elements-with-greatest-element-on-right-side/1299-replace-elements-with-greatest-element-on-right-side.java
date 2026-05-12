class Solution {
    public int[] replaceElements(int[] arr) {
              //int maxx=-1;
        for(int i=0;i<arr.length;i++){
            int maxx=-1;
        
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>maxx){
                    maxx=arr[j];
                }
            }
            arr[i]=maxx;

        }
        return arr;
        
    }
}