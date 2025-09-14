import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger sum = BigInteger.ZERO;
        for(int i:digits){
            sum=sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(i));
        }sum=sum.add(BigInteger.ONE);
        String s1 = sum.toString();
        int[] newplus = new int[s1.length()];
        int j=0;
        for(int i=0;i<s1.length();i++){
            newplus[j++] = s1.charAt(i)-'0';
        }return newplus;
    }
}