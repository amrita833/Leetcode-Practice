class Solution {
    public int passThePillow(int n, int time) {
        int curr=1;
        int dir=1;
        for(int i=0;i<time;i++){
            curr+=dir;
            if(curr==n) dir=-1;
            else if(curr==1) dir=1;

        }
            return curr;
        
    }
}