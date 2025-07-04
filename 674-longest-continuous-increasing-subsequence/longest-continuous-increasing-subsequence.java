class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int i=0;
        int maxi=1;
        int count=1;
        while(i<n-1){
            if(nums[i] < nums[i+1]){
                count++;
                maxi=Math.max(maxi,count);
            }else{
                count=1;
            }i++;
        }return maxi;
    }
}