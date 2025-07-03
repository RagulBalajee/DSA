class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixarr = new int[nums.length];
        int[] suffixarr = new int[nums.length];
        int[] newarr = new int[nums.length];
        prefixarr[0]=1;
        for(int i=1;i<nums.length;i++){
            prefixarr[i] = prefixarr[i-1]*nums[i-1];
        }suffixarr[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffixarr[i] = suffixarr[i+1]*nums[i+1];
        }for(int i=0;i<nums.length;i++){
            newarr[i] = prefixarr[i]*suffixarr[i];
        }return newarr;
    }
}
/*int[] newarray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    prod*=nums[j];
                }
            }newarray[i]=prod;
        }return newarray;*/