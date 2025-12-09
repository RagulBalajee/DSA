class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        for(int i=0;i<cost.length+1;i++){
            if(i==0 || i==1) dp[i]=0;
            else dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }return dp[cost.length];
    }
}