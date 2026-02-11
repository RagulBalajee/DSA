class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=0;
        int j=0;
        int i=1;
        while(k>0){
            if(j < arr.length && i == arr[j]){
                j++;
            }
            else{
                k--;
            }
            if(k==0){
                return i;
            }
            i++;
        }return -1;
    }
}