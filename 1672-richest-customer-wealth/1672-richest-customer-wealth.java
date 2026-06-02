class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxx=Integer.MIN_VALUE;
        
        
        for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum=sum+accounts[row][col];
                
                // maxx=Math.max(max,sum);
                
                
            }
            maxx=Math.max(maxx,sum);
        }
        return maxx;
        
    }
}