class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int j =nums[i];
            int num = target-j;
            if(map.containsKey(num) && map.get(num) != i){
                int k = map.get(num);
                return new int[]{i,k};
            }
        }return new int[]{};
    }
}