package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
	//暴力求解超时
//    public boolean containsDuplicate(int[] nums) {
//        for(int i = 0; i < nums.length; i++){
//        	for(int j = i + 1; j < nums.length; j++){
//        		if(nums[i] == nums[j]){
//        			return true;
//        		}
//        	}
//        }
//        return false;
//    }
	
	//排序
//	public boolean containsDuplicate(int[] nums){
//		Arrays.sort(nums);
//		for(int i = 0; i < nums.length - 1; i++){
//			if(nums[i] == nums[i + 1]){
//				return true;
//			}
//		}
//		return false;
//	}
	
	//Hash Table
	public boolean containsDuplicate(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		for(int num : nums){
			if(set.contains(num)){
				return true;
			}
			set.add(num);
		}
		return false;
	}
}
