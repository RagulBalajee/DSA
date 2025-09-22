class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        /*StringBuilder sb = new StringBuilder(text);
        StringBuilder[] sb = new StringBuilder();
        int k=0;
        for(int i=0;i<sb.length();i++){
            if(text.charAt(i) != ' '){
                sb[k] = text.charAt(i);
            }else{
                k++;
            }
        }*/String[] words = text.split(" ");
        if(brokenLetters.isEmpty()) return words.length;
        String[] w = brokenLetters.split("");
        int k = words.length;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<w.length;j++){    
                if(words[i].contains(w[j])){
                    k--;
                    break;
                }
            }
        }return k;
    }
}