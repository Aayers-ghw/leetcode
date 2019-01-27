package dynamic_programming;

public class Range_Sum_Query_Immutable {
	private int[] sum;
    public void NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++){
        	nums[i] += nums[i - 1];
        }
        this.sum = nums;
    }
    
    public int sumRange(int i, int j) {
    	if(i == 0){
    		return sum[j];
    	}
        return sum[j] - sum[i - 1];
    }
}
