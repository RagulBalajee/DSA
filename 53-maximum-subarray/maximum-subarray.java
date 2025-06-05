class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cs=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            max=Math.max(cs,max);
        }return max;
    }
}