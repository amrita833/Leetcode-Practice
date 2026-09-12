class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int maxdist=0;
        for(int h:houses){
            int mindist=Integer.MAX_VALUE;
            for(int ht:heaters){
                mindist=Math.min(mindist,Math.abs(h-ht));
            }
            maxdist=Math.max(maxdist,mindist);
        }
        return maxdist;
    }
}