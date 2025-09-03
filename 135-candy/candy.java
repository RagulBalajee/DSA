class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies,1);
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]<ratings[i+1]){
                candies[i+1]=candies[i]+1;
            }/*else if(ratings[i]>ratings[i+1]){
                candies[i]++;
            }*/
        }for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int sum=0;
        for(int i:candies){
            sum+=i;
        }return sum;
    }
}