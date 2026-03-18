class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        String ret = "";
        for(int i=0;i<st.size();i++){
            char ch = st.get(i);
            ret+=ch;
        }return ret;
    }
}