package array;

public class Best_Time_to_Buy_and_Sell_Stock {
	public int maxProfit(int[] prices) {
		
//		int maxprofit = 0;
//		for(int i = 0; i < prices.length - 1; i++){
//			for(int j = i + 1; j < prices.length; j++){
//				int profit = prices[j] - prices[i];
//				if(profit > maxprofit){
//					maxprofit = profit;
//				}
//			}
//		}
//		
//		return maxprofit;
		
		int minprices = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for(int i = 0; i < prices.length; i++){
			if(prices[i] < minprices){
				minprices = prices[i];
			}else if(prices[i] - minprices > maxprofit){
				maxprofit = prices[i] - minprices; 
			}
		}
		return maxprofit;
	    }
}
