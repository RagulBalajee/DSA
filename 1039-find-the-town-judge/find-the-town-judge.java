class Solution {
    public int findJudge(int n, int[][] trust) {
        //if(n==2 && trust.length == 1) return trust[0][1];
        if(n==1 && trust.length == 0) return 1; 
        if(n==trust.length) return -1;
        int[] in = new int[n+1];
        int[] out = new int[n+1];
        for(int i=0;i<trust.length;i++){
            in[trust[i][0]]++;
            out[trust[i][1]]++;
        }
        for(int i=0;i<=n;i++){
            if(in[i]==0 && out[i]==n-1)return i;
        }return -1;
    }
}