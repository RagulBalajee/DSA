class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=nums.length;
        int[] nums1 = new int[i/2];
        int[] nums2 = new int[i/2];
        for(int j=0;j<i/2;j++){
            nums1[j] = nums[j];
        }for(int j=0;j<i/2;j++){
            nums2[j] = nums[j+n];
        }ArrayList<Integer> res = new ArrayList<>();
        for(int j=0;j<i/2;j++){
            res.add(nums1[j]);
            res.add(nums2[j]);
        }int[] nums3 = new int[i];
        for(int j=0;j<res.size();j++){
            nums3[j] = res.get(j);
        }return nums3;
    }
}