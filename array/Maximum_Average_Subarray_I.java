package array;

public class Maximum_Average_Subarray_I {
//    public double findMaxAverage(int[] nums, int k) {
//    	if(nums.length == 1){
//    		return nums[0];
//    	}
//    	int sum = Integer.MIN_VALUE, temp = 0;
//    	for(int i = 0; i <= nums.length - k; i++){
//    		for(int j = 0; j < k; j++){
//    			temp += nums[i + j];
//    		}
//    		if(temp > sum){
//    			sum = temp;
//    		}
//    		temp = 0;
//    	}
//    	return sum * 1.0 / k;
//    }
	
	public double findMaxAverage(int[] nums, int k) {
		double sum = 0, res = -10001;
		for(int i = 0; i < nums.length; i++){
			if(i < k){
				sum += nums[i];
			}else{
				sum += nums[i] - nums[i - k];
				res = Math.max(res, sum);
			}
		}
		res = Math.max(res, sum);
		return res / k;
	}
	
	public static void main(String[] args) {
		Maximum_Average_Subarray_I mainTest = new Maximum_Average_Subarray_I();
		double res = mainTest.findMaxAverage(new int[]{9,7,3,5,6,2,0,8,1,9}, 6);
		System.out.print(res);
	}
}
