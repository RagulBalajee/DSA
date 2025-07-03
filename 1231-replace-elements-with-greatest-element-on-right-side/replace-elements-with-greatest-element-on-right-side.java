class Solution {
    public int[] replaceElements(int[] arr) {
        int[] new1 = new int[arr.length];
        int i=0;
        for(;i<arr.length-1;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }new1[i] = max;
        }new1[i] = -1;
        return new1;
    }
}