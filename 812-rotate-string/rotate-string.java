class Solution {
    public boolean rotateString(String s, String goal) {
        String newstring = s+s;
        if(s.length() != goal.length()) return false;
        return newstring.contains(goal);
    }
}