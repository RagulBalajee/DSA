class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        int maxi = 0;
        if(tokens.length!=0 && tokens[0]>power){
            return 0;
        }
        while(i<=j){
            if(power>=tokens[i]){
                score++;
                power-=tokens[i];
                i++;
            }else{
                score--;
                power+=tokens[j];
                j--;
            }maxi=Math.max(maxi,score);
        }return maxi;
    }
}