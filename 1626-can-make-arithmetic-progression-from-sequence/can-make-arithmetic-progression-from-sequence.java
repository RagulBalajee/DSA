class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int max=arr[0]-arr[1];
        boolean valid=true;
        for(int i=0;i<arr.length-1;i++){
            int sum = arr[i]-arr[i+1];
            if(sum != max){
                valid=false;
                break;
            }
            sum=max;
        }if(!valid){
            return false;
        }return true;
    }
}