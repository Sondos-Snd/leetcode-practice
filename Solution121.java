public class Solution121 {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minValue = 100000;

        for(int i=0; i<prices.length;i++){
            if (prices[i]<minValue){
                minValue=prices[i];
            }
            else{
                int profit= prices[i] - minValue;
                maxProfit=Math.max(maxProfit,profit);
            }
        }

        return maxProfit;

    }
}
