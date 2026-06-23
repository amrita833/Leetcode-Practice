class Solution {
    public int totalMoney(int n) {
        int total=0;
        int day=0;
        int monday=1;
        for(int i=1;i<=n;i++){
            total=total+monday+day;
            day++;
            if(day==7){
                day=0;
                monday++;
            }
        }
        return total;

    }
}    