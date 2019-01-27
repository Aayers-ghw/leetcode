package array;

public class Max_Consecutive_Ones {
//    public int findMaxConsecutiveOnes(int[] nums) {
//        int res = 0;
//        int cnt = 0;
//        for(int i = 0; i < nums.length; i++){
//        	res = Math.max(cnt = nums[i] == 0 ? 0 : cnt + 1, res);
//        }
//        return res;
//    }
	
//	public int findMaxConsecutiveOnes(int[] nums) {
//		int res = 0;
//		int sum = 0;
//		for(int num : nums){
//			sum = (sum + num) * num;
//			res = Math.max(sum, res);
//		}
//		return res;
//	}
	
	//dp
	public int findMaxConsecutiveOnes(int[] nums) {
		int[] dp = new int[10000];
		int res = nums[0];
		
		dp[0] = nums[0];
		for(int i = 1; i < nums.length; i++){
			if(nums[i - 1] == 1 && nums[i] == 1){
				dp[i] = dp[i - 1] + 1;
				res = Math.max(res, dp[i]);
			}else if(nums[i] == 1){
				dp[i] = 1; 
				res = Math.max(res, dp[i]);
			}else{
				dp[i] = 0;
			}
		}
		return res;
	}
}
