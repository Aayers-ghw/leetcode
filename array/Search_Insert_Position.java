package array;

public class Search_Insert_Position {

	public int searchInsert(int[] nums, int target) {
		
//		int len = nums.length;
//		if(len == 0)	return 0;
//		
//		int left = 0, right = len - 1, medium;
//		while(left + 1 < right){
//			medium = (left + right) / 2;
//			if(nums[medium] == target){
//				return medium;
//			}else if(nums[medium] < target){
//				left = medium;
//			}else{
//				right = medium;
//			}
//		}
//		
//		if(nums[left] >= target){
//			return left;
//		}else if(nums[right] >= target){
//			return right;
//		}else{
//			return right + 1;
//		}
		
		int len = nums.length;
		
		int left = 0, right = len - 1;
		int mid;
		
		while(left <= right){
			mid = left + (right - left) / 2;
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] <= target){
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}
		
		return left;
	}
}
