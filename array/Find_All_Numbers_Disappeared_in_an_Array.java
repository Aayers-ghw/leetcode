package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_All_Numbers_Disappeared_in_an_Array {
	
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> list = new ArrayList<Integer>();
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i = 0; i < nums.length; i++){
//        	set.add(nums[i]);
//        }
//        for(int i = 0; i < set.size() + 1; i++){
//        	if(!set.contains(i + 1)){
//        		list.add(i + 1);
//        	}
//        }
//        return list;
//    }
	
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i = 0; i < nums.length; i++){
			 int val = Math.abs(nums[i]) - 1;
			 if(nums[val] > 0){
				 nums[val] = -nums[val];
			 }
		 }
		 for(int i = 0; i < nums.length; i++){
			 if(nums[i] > 0){
				 list.add(i + 1);
			 }
		 }
		 return list;
	 }
}
