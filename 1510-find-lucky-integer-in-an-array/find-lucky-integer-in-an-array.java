class Solution {
    public int findLucky(int[] arr) {
        int result=-1;
        for(int i=0;i<arr.length;i++){
            int max=1;
            boolean visited = false;
            for(int k=0;k<i;k++){
                if(arr[i] == arr[k]){
                    visited = true;
                    break;
                }
            }if(visited) continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    max+=1;
                }
            }if(max == arr[i]){
                result = Math.max(result,arr[i]);
            }
        }return result;
    }
}