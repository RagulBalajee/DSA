class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        int[][] arr = new int[n][n];  
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {   
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                rowList.add(arr[i][j]);
            }
            result.add(rowList);
        }

        return result;
    }
}
