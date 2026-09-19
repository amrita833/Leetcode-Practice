class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        ArrayList<Integer>li=new ArrayList<>();
        for(int num:arr){
            int frq=mp.getOrDefault(num,0);
            mp.put(num,frq+1);
        }
        for(int key:mp.keySet()){
            int frq=mp.get(key);
            li.add(frq);
        }
        Collections.sort(li);
        int uniquecount=li.size();
        for(int frq:li){
            if(k>=frq){
                k-=frq;
                uniquecount--;
            } else{
                break;
            }
        }
        return uniquecount;
    }
}