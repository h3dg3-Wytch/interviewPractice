package InterviewCake;

/**
 * Created by rex on 6/20/17.
 */
public class ProblemOne {


//    public static int getMaxProfit(int[] prices){
//        if(prices.length < 2)
//            throw new Error("Not enough prices!");
//
//        int minPrice = prices[0];
//        int maxPrice = prices[1] - prices[0];
//
//        for(int i = 1; i < prices.length; i++){
//            int currentPrice = prices[i];
//
//            int potentialProfits = currentPrice - minPrice;
//
//            maxPrice = Math.max(maxPrice, potentialProfits);
//
//            minPrice = Math.min(minPrice, currentPrice);
//        }
//        return maxPrice;


    //brute force
    public static int getMaxProfit(int[] stocks){
        int maxProfit = stocks[0] - stocks[1];
        for(int i = 1; i < stocks.length; i++){
            for(int j = i + 1; j < stocks.length; j++){
                maxProfit = Math.max(maxProfit, ((stocks[i] - stocks[j]) * -1));
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
        System.out.println(getMaxProfit(stockPricesYesterday));
    }
}
