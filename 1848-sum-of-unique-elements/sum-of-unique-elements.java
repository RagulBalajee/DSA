class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j)
                {   if(nums[i] == nums[j]){
                        c++;
                    }
                }
            }if(c==0){
                sum+=nums[i];
            }
            c=0;
        }return sum;
    }
}