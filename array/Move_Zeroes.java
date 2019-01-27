package array;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for(j = 0; j < nums.length; j++){
        	if(nums[j] != 0){
        		nums[i++] = nums[j];
        	}
        }
        for(int k = i; k < nums.length; k++){
        	nums[k] = 0;
        }
    }
}
