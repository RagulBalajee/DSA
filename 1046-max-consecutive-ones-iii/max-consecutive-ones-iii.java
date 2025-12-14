class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int k1=0;
        //int count=0;
        int winsize=0;
        while(end<nums.length){
            if(nums[end] == 0) k1++;
            while(k1>k){
                if(nums[start]==0){
                    k1--;
                }start++;
            }
            winsize=Math.max(winsize,end-start+1);
            end++;
        }return winsize;
    }
}