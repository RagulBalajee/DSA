class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int right=0;
        int left=0,count=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(right<arr1.length){
            boolean valid=true;
            for(left=0;left<arr2.length;left++){
                int sum=Math.abs(arr1[right]-arr2[left]);
                if(sum<=d){valid=false;
                break;
                }
            }if(valid){
                count++;
            }
            right++;
        }return count;
    }
}