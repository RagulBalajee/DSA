class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<k;i++)
            max+=nums[i];
        sum=Math.max(sum,max);
        for(int i=k;i<nums.length;i++){
            max+=nums[i]-nums[i-k];
            sum=Math.max(sum,max);
        }return sum/k;
    }
}