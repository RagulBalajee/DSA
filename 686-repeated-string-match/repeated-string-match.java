class Solution {
    public int repeatedStringMatch(String a, String b) {
        String original = a;
        int count=1;
        while(a.length() < b.length()){
            a=original+a;
            count++;
        }if(a.contains(b)){
            return count;
        }
        a=original+a;
        if(a.contains(b)){
            return count+1;
        }
        
        return -1;
    }
}