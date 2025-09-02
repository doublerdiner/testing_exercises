package CodingPractice;

public class BuySell {
    public static void main(String[] args) {
        int[] testArray = {4,7,1,2};
        System.out.println(highestProfit(testArray));
    }

    private static int highestProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit, prices[i]-buy);
            }

        }
        return maxProfit;
    }
}
