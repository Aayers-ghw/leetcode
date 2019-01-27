package array;

public class Best_Time_to_Buy_and_Sell_Stock_II {
	public int maxProfit(int[] prices) {
		int res = 0;
		for(int i = 0; i < prices.length - 1; i++){
			if(prices[i + 1] > prices[i]){
				res += prices[i + 1] - prices[i];
			}
		}
		return res;
	    }
}
