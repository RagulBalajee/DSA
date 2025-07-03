class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int right=0;
        int left=nums.length-1;
        while(left>=right){
            if(nums[right]%2==0){
                right++;
            }else if(nums[left]%2!=0){
                left--;
            }else{
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left--;
                right++;
            }
        }return nums;
    }
}