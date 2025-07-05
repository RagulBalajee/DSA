class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int sum=0;
        int n=nums.length;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxi=(double) sum/k;
        for(i=k;i<nums.length;i++){
            sum=(sum+nums[i]-nums[i-k]);
            maxi=Math.max((double)sum/k,maxi);
        }return maxi;
    }
}