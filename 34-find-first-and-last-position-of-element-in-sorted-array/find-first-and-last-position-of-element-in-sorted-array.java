class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int[] res = {-1,-1};
        if (nums.length == 0) {
            return res;
        }
        int num=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid] == target){
                num=mid;
                break;
            }else if(nums[mid] < target){
                i=mid+1;;
            }else{
                j=mid-1;
            }
        }
        int start=num;
        int end=num;
        while(start>0 && nums[start-1] == target){
            start--;
        }while(end<nums.length-1 && nums[end+1] == target){
            end++;
        }res[0]=start;
        res[1]=end;
        return res;
    }
}