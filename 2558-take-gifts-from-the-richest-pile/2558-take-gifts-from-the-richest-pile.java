class Solution {
    public long pickGifts(int[] gifts, int k) {
        
     //   for(int i=0;i<gifts.length;i++){
        //    Arrays.sort(gifts,Collections.reverseOrder());

        //}
        /*int n=gifts.length;
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i<k){
            gifts[i]=Math.sqrt(gifts[i]);
            }
            sum=sum+gifts[i];
        }
        return sum;
    }
}*/
        for(int i = 0; i < k; i++) {
            Arrays.sort(gifts); 
            int n = gifts.length - 1; 
            gifts[n] = (int)Math.sqrt(gifts[n]); 
        }

        long sum = 0;
        for(int i = 0; i < gifts.length; i++) {
            sum += gifts[i]; 
        }
        return sum;
    }
}
