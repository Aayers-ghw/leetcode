package array;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_II_Input_array_is_sorted {
	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
		while(left < right){
			if(numbers[left] + numbers[right] == target){
				return new int[]{left + 1, right + 1};
			}else if(numbers[left] + numbers[right] < target){
				left++;
			}else{
				right--;
			}
		}
		return null;
	}
}
