class Solution {
    public int findMaxFish(int[][] grid){
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int sum = dfs(grid,i,j,0);
                max=Math.max(sum,max);
                sum=0;
            }
        }return max;
    }
    public static int dfs(int[][] grid ,int i,int j,int sum){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 ) return 0;
        sum=grid[i][j];
        grid[i][j]=0;
        sum+=dfs(grid,i-1,j,0);
        sum+=dfs(grid,i+1,j,0);
        sum+=dfs(grid,i,j-1,0);
        sum+=dfs(grid,i,j+1,0);
        return sum;
    }
}