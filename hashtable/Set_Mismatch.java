package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Set_Mismatch {

    public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 1; i <= nums.length; i++) {
        	if(map.containsKey(nums[i-1])) {
        		dup = nums[i - 1];
        	}else {
        		map.put(nums[i-1], 1);
        	}
        }
        for(int i = 1; i <= nums.length; i++) {
        	if(!map.containsKey(i)) {
        		missing = i;
        	}
        }
        
        return new int[]{dup, missing};
    }
}
