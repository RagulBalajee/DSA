class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String i:str){
            result.append(new StringBuilder(i).reverse().toString()).append(" ");
        }return result.toString().trim();
    }
}