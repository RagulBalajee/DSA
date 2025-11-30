class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int m1=house(nums,0,n-2);
        int m2=house(nums,1,n-1);
        int m=Math.max(m1,m2);
        return m;
    }
    public int house(int[] nums,int start,int end){
        int[] arr = new int[nums.length];
        int m=end-start+1;
        arr[0]=0;
        arr[1]=nums[start];
        for(int i=2;i<m+1;i++){
            arr[i]=Math.max(arr[i-1],arr[i-2]+nums[start+i-1]);
        }
        return arr[m];
    }
}