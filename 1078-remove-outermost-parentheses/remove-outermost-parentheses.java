class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int counter=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == ')'){
                counter--;
            }if(counter!=0){
                ans.append(s.charAt(i));
            }if(s.charAt(i)=='('){
                counter++;
            }
        }return ans.toString();
    }
}