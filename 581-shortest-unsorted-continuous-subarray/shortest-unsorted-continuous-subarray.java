class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }Arrays.sort(copy);
        /*for(int i=0;i<nums.length;i++){
        System.out.print(copy[i]);}*/
        int i=0,j=nums.length-1;
        while(i<nums.length && nums[i]==copy[i]){
            i++;
        }while(j>=0 && nums[j] == copy[j]){
            j--;
        }
        if(i>=j) return 0;
        return j-i+1;
        
    }
}