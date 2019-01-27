package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kdiff_Pairs_in_an_Array {
    public int findPairs(int[] nums, int k) {
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int res = 0;
    	if(k < 0){
    		return res;
    	}
    	for(int i = 0; i < nums.length; i++){
    		map.put(nums[i], i);
    	}
    	for(int i = 0; i < nums.length; i++){
    		if(map.containsKey(nums[i] + k) && map.get(nums[i] + k) != i){
    			res++;
    			map.remove(nums[i] + k);
    		}
    	}
    	return res;
    	
    }
}
