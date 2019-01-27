package bsearch;

public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int low = 0;
        int hight = nums.length - 1;
        
        if(nums[hight] > nums[low]){
            return nums[0];
        }
        
        while(low <= hight){
            int mid = low + ((hight - low) >> 1);
            if(nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }else if(nums[mid] < nums[low]){
                hight = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        return -1;
    }
}
