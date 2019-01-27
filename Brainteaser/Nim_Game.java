package Brainteaser;

public class Nim_Game {
//	private int[] dp = new int[100000];
//    public boolean canWinNim(int n) {
//        if(fun(n) == 1){
//        	return true;
//        }else{
//        	return false;
//        }
//        
//    }	
//    public int fun(int n){
//    	if(dp[n] != 0){
//    		return dp[n];
//    	}
//    	for(int i = 1; i <= 3; i++){
//    		if(n >= i && fun(n - i) == -1){
//    			dp[n] = 1;
//    			return 1;
//    		}
//    	}
//    	dp[n] = -1;
//    	return -1;
//    }
	

	public boolean canWinNim(int n) {
		if(n % 4 == 0){
			return false;
		}
		return true;
	}
}
