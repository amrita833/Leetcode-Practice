class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    li.add(order[i]);
                }
            }
        }
         int[] result = new int[li.size()];
        for (int k = 0; k < li.size(); k++) {
            result[k] = li.get(k);
        }
        
        return result;

        
    }
}