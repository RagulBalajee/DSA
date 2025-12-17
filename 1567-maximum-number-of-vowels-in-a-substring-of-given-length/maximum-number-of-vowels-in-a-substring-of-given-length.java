class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        int start=0;
        int end=0;
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        /*for(int i=0;i<=s.length()-k;i++){
            int max=0;
            for(int j=i;j<i+k;j++){
                if(isVowel(s.charAt(j))){
                    max++;
                }
            }count=Math.max(count,max);
        }return count;
    }public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;*/
        for(int i=0;i<k;i++){
            if(vowel.contains(s.charAt(i)))
            count++;
        }max=Math.max(max,count);
        for(int i=k;i<s.length();i++){
            if(vowel.contains(s.charAt(i-k))) count--;
            if(vowel.contains(s.charAt(i))) count++;
            max=Math.max(max,count);
        }return max;
    }
}