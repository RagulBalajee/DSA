class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        if(k<=1) return 0;
        int right=0;
        int left=0,prod=1;
        for(;right<nums.length;right++){
            prod=prod*nums[right];
            while(prod>=k){
                prod /= nums[left];
                left++;
            }count+=(right-left+1);
        }return count;
    }
}