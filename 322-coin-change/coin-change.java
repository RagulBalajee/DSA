class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        //if(amount==coins[0]) return 1;
        int n=coins.length;
        int a = amount+1;
        int[][] dp = new int[n+1][amount+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=a;
            }
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1]) 
                dp[i][j]= Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                else 
                dp[i][j]= dp[i-1][j];
            }
        }
         int result = dp[n][amount];
        return result == amount+1 ? -1 : result;
    }
}