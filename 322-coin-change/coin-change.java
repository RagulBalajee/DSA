class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=amount+1;
            }
        }
        for(int i=0;i<=coins.length;i++)
        {
            dp[i][0]=0;
        }
        
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1]) 
                dp[i][j]= Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                else 
                dp[i][j]= dp[i-1][j];
            }
        }
        return dp[coins.length][amount] == amount+1 ? -1 : dp[coins.length][amount];
    }
}