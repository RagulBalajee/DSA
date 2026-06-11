class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        for(int i=0;i<rooms.size();i++){
            vis[i]=false;
        }
        dfs(vis,rooms,0);
        for(int i=0;i<rooms.size();i++){
            if(vis[i] == false) return false;
        }return true;
    }
    public void dfs(boolean[] vis , List<List<Integer>> rooms , int key){
        if(vis[key]==true) return;
        vis[key]=true;
        for(int i : rooms.get(key)){
            dfs(vis,rooms,i);
        }
    }
}