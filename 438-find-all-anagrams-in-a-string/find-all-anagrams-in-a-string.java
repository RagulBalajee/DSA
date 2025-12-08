class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() == 0 || p.length() == 0) return res;
        if(s.length() < p.length()) return res;
        int[] sarr = new int[26];
        int[] parr = new int[26];
        for(char ch : p.toCharArray()){
            parr[ch-'a']++;
        }for(int i=0;i<s.length();i++){
            sarr[s.charAt(i)-'a']++;
            if(i>=p.length()){
                sarr[s.charAt(i-p.length())-'a']--;
            }if(Arrays.equals(sarr,parr)){
                res.add(i-p.length()+1);
            }
        }return res;
    }
}