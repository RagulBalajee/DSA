class Solution {
    public int maxProfit(int[] prices) {
        int min=0;
        int result = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[min]>prices[i]){
                min=i;
            }result = Math.max(result,prices[i]-prices[min]);
        }
        return result;
    }
}