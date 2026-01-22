class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] mis = new int[2];
        //int j=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    mis[0]=i;
                }
            }else{
                mis[1]=i;
            }
        }return mis;
    }
}