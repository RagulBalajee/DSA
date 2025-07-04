class Solution {
    public int maxOperations(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        int count=0;
        while(i<j){
            int temp=nums[i]+nums[j];
            if(temp==k){
                count++;
                i++;
                j--;
            }else if(temp>k){
                j--;
            }else{
                i++;
            }
        }return count;
    }
}