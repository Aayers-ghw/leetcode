package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
	
//	public int majorityElement(int[] nums) {
//		
//		//暴力法
//		int majorityCount = nums.length / 2;
//        for (int num:nums) {
//            int count = 0;
//            for (int elem:nums
//                 ) {
//                if (num == elem){
//                    count++;
//                }
//                if(count > majorityCount){
//                    return  num;
//                }
//            }
//        }
//        return -1;
//	}
	
	
	
//	//HashMap法
//	private Map<Integer, Integer> countNums(int[] nums){
//		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
//		for(int num : nums){
//			if(!counts.containsKey(num)){
//				counts.put(num, 1);
//			}else{
//				counts.put(num, counts.get(num) + 1);
//			}
//		}
//		return counts;
//	}
//	public int majorityElement(int[] nums) {
//		Map<Integer, Integer> counts = countNums(nums);
//		
//		Map.Entry<Integer, Integer> majorityEntry = null;
//		for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
//			if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()){
//				majorityEntry = entry;
//			}
//		}
//		return majorityEntry.getKey();
	
	
	
	
	//sort法
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		
		return nums[nums.length / 2];
	
	}
	
}
