package CodingPractice;

public class BuySell2 {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        System.out.println(buySellMethod(testArray));

        System.out.println(buySellMethod(new int[]{5,4,3,2,1}));
        System.out.println(buySellMethod(new int[]{7,1,1,2,5}));
    }

    private static int buySellMethod(int[] prices) {
        int total = 0;
        int maxProfit = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i-1] > prices[i]){
                total += maxProfit;
                maxProfit = 0;
                buy = prices[i];
            }
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                maxProfit = Math.max(maxProfit, prices[i]-buy);
            }
        }
        return total + maxProfit;
    }
}
