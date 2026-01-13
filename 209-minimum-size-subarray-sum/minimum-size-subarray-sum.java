class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int winsize = Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
            end++;
            while(sum >= target){
                winsize = Math.min(winsize,end-start);
                sum-=nums[start];
                start++;
            }
        }return (winsize == Integer.MAX_VALUE) ? 0 : winsize;
    }
}