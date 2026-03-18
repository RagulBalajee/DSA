class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch = operations[i];
            if(ch.equals("+")){
                int size = st.size();
                int sum = st.get(size-1)+st.get(size-2);
                st.push(sum);
            }else if(ch.equals("D")){
                int size = st.size();
                int mul = st.get(size-1) * 2;
                st.push(mul);
            }else if(ch.equals("C")){
                st.pop();
            }
            else{
            st.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        for(int i=0;i<st.size();i++){
            sum+=st.get(i);
        }return sum;
    }
}