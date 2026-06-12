class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans=Math.max(ans,dfs(0,i,j,dp,matrix));
            }
        }return ans;
    }
    public int dfs(int ans , int i , int j , int[][] dp , int[][] matrix){

        if(i<0 || j<0 || i>=matrix.length || j >= matrix[0].length) return 0;
        ans=1;
        if(dp[i][j] != 0) return dp[i][j];
        if(i-1 >= 0 && matrix[i][j] < matrix[i-1][j]) ans=Math.max(ans,1+dfs(ans,i-1,j,dp,matrix));
        if(i+1 < matrix.length && matrix[i][j] < matrix[i+1][j] ) ans=Math.max(ans,1+dfs(ans,i+1,j,dp,matrix));
        if(j+1 < matrix[0].length && matrix[i][j] < matrix[i][j+1] ) ans=Math.max(ans,1+dfs(ans,i,j+1,dp,matrix));
        if(j-1 >= 0 && matrix[i][j] < matrix[i][j-1] ) ans=Math.max(ans,1+dfs(ans,i,j-1,dp,matrix));
        dp[i][j]=ans;
        return ans;
    }
}