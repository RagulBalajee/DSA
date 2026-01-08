class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int[] endi = new int[26];
        for(int i=0;i<s.length();i++){
            endi[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=endi[s.charAt(0)-'a'];
        for(int i=0;i<s.length();i++){
            if(endi[s.charAt(i)-'a'] > end) end = endi[s.charAt(i)-'a'];
            if(i==end){
                int a=end-start+1;
                ans.add(a);
                start=end+1;
                
                if(start<s.length()) end=endi[s.charAt(start)-'a'];
            }
        }return ans;
    }
}
