package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Missing_Number {
	
	//sort
//    public int missingNumber(int[] nums) {
//    	int len = nums.length;
//        Arrays.sort(nums);
//        for(int i = 0; i < len; i++){
//        	if(nums[i] != i){
//        		return i;
//        	}
//        }
//        return nums[len - 1] + 1;
//    }
	
	//HashSet
//	public int missingNumber(int[] nums) {
//		Set<Integer> set = new HashSet<Integer>();
//		for(int i = 0; i < nums.length + 1; i++){
//			set.add(i);
//		}
//		for(int i = 0; i < nums.length; i++){
//			if(!set.contains(nums[i])){
//				return i;
//			}
//		}
//		return -1;
//	}
	

	
	//Bit Manipulation
//	public int missingNumber(int[] nums) {
//		int len = nums.length;
//		for(int i = 0; i < nums.length; i++){
//			len ^= i ^ nums[i];
//		}
//		return len;
//	}
	
	//Gauss' Formula
	public int missingNumber(int[] nums) {
		int expectedSum = nums.length * (nums.length - 1) / 2;
		int actualSum = 0;
		for(int i = 0; i < nums.length; i++){
			actualSum += nums[i];
		}
		return expectedSum - actualSum;
	}
}
