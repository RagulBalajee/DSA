class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sumprod=1;
                sumprod = (nums[i]-1)*(nums[j]-1);
                max=Math.max(sumprod,max);
            }
        }return max;
    }
}