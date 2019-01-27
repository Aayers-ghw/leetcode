package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> res = new LinkedList<>();
    	for(int i = 0; i < nums.length - 2; i++){
    		if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
    			int r = i + 1, c = nums.length - 1, sum = -nums[i];
	    		while(r < c){
	    			if(nums[r] + nums[c] == sum){
	    				res.add(Arrays.asList(nums[i], nums[r], nums[c]));
	    				while(r < c && nums[r] == nums[r + 1])	r++;
	    				while(r < c && nums[c] == nums[c - 1])	c--;
	    				r++;
	    				c--;
	    			}else if(nums[r] + nums[c] < sum){
	    				r++;
	    			}else{
	    				c--;
	    			}
	    		}
    		}
    	}
    	return res;
    }
}
