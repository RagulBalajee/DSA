class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String s1=String.valueOf(ch);
            if(!mp.containsKey(s1)){
                mp.put(s1,new ArrayList<>());
            }
            mp.get(s1).add(s);
        }return new ArrayList<>(mp.values());
    }
}