class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int n1=n*5/100;
        int n2=n-n1;
        double sum=0;
        for(int i=n1;i<n2;i++){
            sum=sum+arr[i];
        }double mean = sum/(double)(n-2*n1);
        return mean;
    }
}