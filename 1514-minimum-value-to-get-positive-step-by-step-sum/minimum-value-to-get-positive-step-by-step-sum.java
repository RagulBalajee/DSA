class Solution {
    public int minStartValue(int[] nums) {
        int count=1;
        while(true){
            int sum=count;
            boolean valid=true;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum <= 0){
                    valid=false;
                    break;
                }
            }
            if(valid){
                return count; 
            }count++;
        }
    }
}