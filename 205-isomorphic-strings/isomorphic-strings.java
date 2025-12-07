class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sh = new HashMap<>();
        HashMap<Character,Character> th = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 =s.charAt(i);
            char ch2 = t.charAt(i);
            if((sh.containsKey(ch1) && sh.get(ch1) != ch2) || (th.containsKey(ch2) && th.get(ch2) != ch1)){
                return false;
            }
            sh.put(ch1,ch2);
            th.put(ch2,ch1);
        }return true;
    }
}