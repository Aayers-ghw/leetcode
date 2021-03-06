package array;

public class Remove_Element {

	public int removeElement(int[] nums, int val) {
		
		int len = nums.length;
		if(len == 0)	return 0;
		
		int i = 0;
		for(int j = 0; j < len; j++){
			if(nums[j] != val){
				nums[i++] = nums[j];
			}
		}
		
		return i;
	}
}
