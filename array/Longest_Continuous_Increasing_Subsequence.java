package array;

public class Longest_Continuous_Increasing_Subsequence {
//    public int findLengthOfLCIS(int[] nums) {
//    	if(nums.length == 0){
//    		return 0;
//    	}
//        int[] dp = new int[nums.length + 1];
//        dp[0] = 1;
//        int res = 1;
//        for(int i = 1; i < nums.length; i++){
//        	if(nums[i - 1] < nums[i]){
//        		dp[i] = dp[i - 1] + 1;
//        	}else{
//        		dp[i] = 1;
//        	}
//        	res = Math.max(res, dp[i]);
//        }
//        return res;
//    }
	
	public int findLengthOfLCIS(int[] nums) {
		int res = 0, cnt = 0;
		for(int i = 0; i < nums.length; i++){
			if(i == 0 || nums[i - 1] < nums[i]){
				cnt++;
				res = Math.max(res, cnt);
			}else{
				cnt = 1;
			}
		}
		return res;
	}
}
