class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int a=0;
        int b=0;
        int c=0;
        while(a < players.length && b< trainers.length){
            if(players[a] <= trainers[b]){
                a++;
                b++;
                c++;
            }else{
                b++;
            }
        }return c;
    }
}