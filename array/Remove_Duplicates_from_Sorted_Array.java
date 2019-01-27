package array;

public class Remove_Duplicates_from_Sorted_Array {

	public int removeDuplicates(int[] nums) {
		
		int len = nums.length;
		if(len == 0)	return 0;
		
		int i = 0;
		for(int j = 1; j < len ; j++){
			if(nums[j] != nums[i]){
				i++;
				nums[i] = nums[j];
			}
		}
		
		return i + 1;
	}
}
