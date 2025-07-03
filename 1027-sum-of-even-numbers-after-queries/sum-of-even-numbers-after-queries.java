class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res = new int[nums.length];
        int k=0;
        for(int i=0;i<queries.length;i++){
            int indices = queries[i][1];
            nums[indices] = nums[indices]+queries[i][0];
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] % 2 ==0){
                    sum+=nums[j];
                }    
            }
            res[k] = sum;
            k++;
        }
        int n=queries.length;
        int[] new1 = new int[n];
        for(int i=0;i<n;i++){
            new1[i] = res[i];
        }
        return new1;
    }
}