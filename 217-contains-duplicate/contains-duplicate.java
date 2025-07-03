class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res1 = new HashSet<>();
        for(int num:nums){
            if(res1.contains(num)){
                return true;
            }res1.add(num);
        }return false;
    }
}