package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {
    public int singleNumber(int[] nums) {
    	int res = nums[0];
    	for(int i = 1; i < nums.length; i++){
    		res ^= nums[i];
    	}
    	return res;
    }
}
