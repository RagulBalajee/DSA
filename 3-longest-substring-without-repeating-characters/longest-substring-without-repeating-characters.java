class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int maxlen=Math.min(s.length(),1);
        HashSet<Character> map = new HashSet<>();
        while(end < s.length()){
            char ch = s.charAt(end);
            while(map.contains(ch)){
                map.remove(s.charAt(start));
                start=start+1;
            }
            map.add(ch);
            end++;
            int len = end-start;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}