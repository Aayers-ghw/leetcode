package array;

import java.util.Arrays;

public class Largest_Number_At_Least_Twice_of_Others {
    public int dominantIndex(int[] nums) {
    	int firstMax = -1, secondMax = -1;
    	int index = -1;
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] > firstMax){
    			secondMax = firstMax;
    			firstMax = nums[i];
    			index = i;
    		}else if(nums[i] > secondMax){
    			secondMax = nums[i];
    		}
    	}
    		
    	if(firstMax >= 2 * secondMax){
    		return index;
    	}else{
    		return -1;
    	}
    }
}
