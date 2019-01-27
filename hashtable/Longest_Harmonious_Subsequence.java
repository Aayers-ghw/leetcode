package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_Harmonious_Subsequence {

//	//Using Sorting
//    public int findLHS(int[] nums) {
//    	Arrays.sort(nums);
//    	int res  = 0, prev_count = 1;
//    	for(int i = 0; i < nums.length; i++) {
//    		int count = 1;
//    		if(i > 0 && nums[i] - nums[i - 1] == 1) {
//    			while(i < nums.length - 1 && nums[i] == nums [i + 1]) {
//    				count++;
//    				i++;
//    			}
//    			res = Math.max(res, count + prev_count);
//    			prev_count = count;
//    		}else {
//    			while(i < nums.length - 1 && nums[i] == nums[i + 1]) {
//    				count++;
//    				i++;
//    			}
//    			prev_count = count;
//    		}
//    	}
//    	return res;
//    }
	
//	//Using HashMap
//	public int findLHS(int[] nums) {
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		int res = 0;
//		for(int num : nums) {
//			if(map.containsKey(num)) {
//				map.put(num, map.get(num) + 1);
//			}else {
//				map.put(num, map.get(num));
//			}
//		}
//		for(int key : map.keySet()) {
//			if(map.containsKey(key + 1)) {
//				res = Math.max(res, map.get(key) + map.get(key + 1));
//			}
//		}
//		return res;
//	}
	
	//In single loop
	public int findLHS(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;
		for(int num : nums) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			}else {
				map.put(num, map.get(num));
			}
			if(map.containsKey(num + 1)) {
				res = Math.min(res, map.get(num) + map.get(num + 1));
			}
			if(map.containsKey(num - 1)) {
				res = Math.min(res, map.get(num) + map.get(num - 1));
			}
		}
		return res;
	}
}
