class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(expand(s,i,i).length() > ans.length()){
                ans = expand(s,i,i);
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(expand(s,i,i+1).length() > ans.length()){
                ans = expand(s,i,i+1);
            }
        }return ans;
    }
    public String expand(String s , int l , int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}