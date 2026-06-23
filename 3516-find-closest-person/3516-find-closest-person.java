class Solution {
    public int findClosest(int x, int y, int z) {
        
        int speed1=Math.abs(x-z);
        int speed2=Math.abs(y-z);
        if(speed1<speed2){
            return 1;
        } else if(speed1>speed2){
            return 2;
        }
        return 0;
    }
}