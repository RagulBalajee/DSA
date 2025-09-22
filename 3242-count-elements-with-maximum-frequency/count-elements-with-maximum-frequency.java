class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int[] freq = new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        max=0;
        for(int i=0;i<freq.length;i++){
            max = Math.max(max,freq[i]);
        }
        int sum = 0;
        for(int i=0;i<freq.length;i++){
            if(max == freq[i]){
                sum+=freq[i];
            }
        }return sum;
    }
}