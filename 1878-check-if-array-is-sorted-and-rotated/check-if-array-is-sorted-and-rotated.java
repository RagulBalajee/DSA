class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }int i=0;
        Arrays.sort(arr);
        
        while(i<n){
            boolean rot=true;
            for(int x=0;x<n;x++){  
                if(nums[x] != arr[(i+x)%n]){
                    rot=false;
                    break;
                }
            }i++;
        if(rot) return true;
        }return false;
    }
}
