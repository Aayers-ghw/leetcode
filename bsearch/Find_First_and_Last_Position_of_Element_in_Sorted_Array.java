package bsearch;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if(nums == null || nums.length == 0) return res;
        int low = 0;
        int hight = nums.length - 1;
        for(;low <= hight;){
            int mid = low + ((hight - low) >> 1);
            if(nums[mid] > target){
                hight = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                if(mid == 0 || nums[mid - 1] != target){
                     res[0] = mid;
                    break;
                }
                hight = mid - 1;
            }
        }
        
        if(res[0] == -1) return res;
        
        low = 0;
        hight = nums.length - 1;
        for(; low <= hight; ){
            int mid = low + ((hight - low) >> 1);
            if(nums[mid] > target){
                hight = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                if(mid == nums.length - 1 || nums[mid + 1] != target){
                     res[1] = mid;
                    break;
                }
                low = mid + 1;
            }
        }
        return res;
    }
}
