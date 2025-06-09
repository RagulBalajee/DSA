/*class Solution {
    public int maxProduct(int[] nums) {
        
    }
}*/

class Solution{
    public int maxProduct(int[] nums){
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            int psum=1;
            for(int j=i;j<n;j++){
                psum=psum*nums[j];
                if(psum>max){
                    max=psum;
                }
            }
        }return max;
    }
}