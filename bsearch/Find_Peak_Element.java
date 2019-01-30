package bsearch;

public class Find_Peak_Element {

//	//˳������
//	public int findPeakElement(int[] nums) {
//        for(int i = 0; i < nums.length - 1; ++i){
//            if(nums[i] > nums[i + 1]){
//                return i;
//            }
//        }
//        return nums.length - 1;
//    }
	
	//��������
	public int findPeakElement(int[] nums) {
		int low = 0;
	    int hight = nums.length - 1;
	    while(low < hight){
	        int mid = low + ((hight - low) >> 2);
	        if(nums[mid] < nums[mid + 1]){
	            low = mid + 1;
	        }else{
	            hight = mid;
	        }
	    }
	    return low;
	}
}
