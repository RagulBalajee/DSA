class Solution {
    public int mincostTickets(int[] days, int[] costs) {

        int n = days.length;
        int[][] dp = new int[n + 1][costs.length+1];

        for (int i = n; i >= 0; i--) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int t = 0; t < 4; t++) {
            dp[n][t] = 0;
        }
        int[] duration = {1, 7, 30};

        for (int i = n - 1; i >= 0; i--) {

            for (int t = 0; t < 3; t++) {

                int j = i;

                while (j < n && days[j] < days[i] + duration[t]) {
                    j++;
                }

                dp[i][t] = costs[t] + dp[j][0];
            }

            dp[i][3] = Math.min(
                    dp[i][0],
                    Math.min(dp[i][1], dp[i][2])
            );

            for (int t = 0; t < 3; t++) {
                dp[i][t] = dp[i][3];
            }
        }

        return dp[0][3];
    }
}