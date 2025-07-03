class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> res1 =new HashSet<>();
        List<Integer> res2 =new ArrayList<>();
        for(int i:nums){
            res1.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!res1.contains(i)){
                res2.add(i);
            }
        }
        
        return res2;
    }
}