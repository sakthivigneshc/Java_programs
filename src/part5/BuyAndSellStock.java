package part5;
public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int MinPrice = Integer.MAX_VALUE;
        int MaxPrice =  0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<MinPrice){
                MinPrice = prices[i];
            }
            else{
               int  profit = prices[i]-MinPrice;
               if(profit>MaxPrice){
                MaxPrice = profit;
               }
            }
        }

        return MaxPrice;
        
    }
    
    public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,40};
		int stockProfit = maxProfit(prices);
		System.out.println("The profit is : "+stockProfit);
		
	}
}




// 121. Best Time to Buy and Sell Stock
//D - 3