class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxi=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }maxi=Math.max(count,maxi);
            if(maxi!=index){
                index=i;
            }
        }return nums[index];
    }
}