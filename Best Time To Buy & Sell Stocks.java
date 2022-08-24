public class BuynSellStocks {

    public static int maxProfit(int prices[]){
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i=1; i<prices.length;i++){
          
          //if current day price is less than previous days, then make it the buying price
            if(prices[i]<buyPrice){
                minPrice = prices[i];
            }
          
          //if current day price is greater than previos days, calculate profit and compare
            else{
                int profit = prices[i] - buyPrice; //today's profit
                if (profit > maxProfit)
                    maxProfit = profit;   //gloobal profit
            }

        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    
}
