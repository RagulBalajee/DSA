class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] intersection = new int[nums1.length];
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i] == nums2[j]){
                intersection[k] = nums1[i];
                i++;
                k++;
                j++;
            }else if(nums1[i] >= nums2[j]){
                j++;
            }else{
                i++;
            }
        }return Arrays.copyOfRange(intersection,0,k);
    }
}