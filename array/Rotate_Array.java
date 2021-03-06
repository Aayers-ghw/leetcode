package array;

import java.util.Arrays;

public class Rotate_Array {
	
//	public void rotate(int[] nums, int k) {
//		int temp, previous;
//		for(int i = 0; i < k; i++){
//			previous = nums[nums.length];
//			for(int j = 0; j < nums.length; j++){
//				temp = nums[j];
//				nums[j] = previous;
//				previous = temp;
//			}
//		}
//	}
	
	
//	public void rotate(int[] nums, int k){
//		int[] a = new int[nums.length];
//		for(int i = 0; i < nums.length; i++){
//			a[(i + k) % nums.length] = nums[i];
//		}
//		for(int i = 0; i < nums.length; i++){
//			nums[i] = a[i];
//		}
//	}
	
	public void rotate(int[] nums, int k){
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	public void reverse(int[] nums, int start, int end){
		int temp;
		while(start < end){
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
