package bsearch;

public class Search_in_Rotated_Sorted_Array {

	public int search(int[] nums, int target) {
        // if(nums == null || nums.length == 0) return -1;
        // int low = 0;
        // int hight = nums.length - 1;
        // while(low + 1 < hight){
        //     int mid = low + ((hight - low) >> 1);
        //     if(nums[mid] == target) return mid;
        //     if(nums[mid] > nums[low]){
        //         if(nums[low] <= target && target <= nums[mid]) {
        //             hight = mid;
        //         }
        //         else{
        //             low = mid;
        //         }
        //     }else if(nums[mid] < nums[hight]){
        //         if(nums[mid] <= target && target <= nums[hight]) {
        //             low = mid;
        //         }
        //         else{
        //             hight = mid;
        //         }
        //     }
        // }
        // if(nums[low] == target) return low;
        // if(nums[hight] == target) return hight;
        // return -1; 
        
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return target == nums[0] ? 0 : -1;
        int index = find_rotate_index(nums, 0, nums.length - 1);
        
        if(nums[index] == target) return index;   
        if(index == 0) return search(nums, 0, nums.length - 1, target);
        if(nums[0] > target){
            return search(nums, index, nums.length - 1, target);
        }else{
            return search(nums, 0, index, target);
        }
       
    }
    
    public static int search(int[] nums, int left, int right, int target) {
            /*
            Binary search
            */
            while (left <= right) {
              int pivot = (left + right) / 2;
              if (nums[pivot] == target)
                return pivot;
              else {
                if (target < nums[pivot])
                  right = pivot - 1;
                else
                  left = pivot + 1;
              }
            }
            return -1;
          }
    
    public static int find_rotate_index(int[] a, int left, int right) {
            if(a[left] < a[right]) return 0;
            
            while(left <= right){
                int mid = left + ((right - left) >> 1);
                if(a[mid] > a[mid + 1]) return mid + 1;
                if(a[mid] < a[left]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            return 0;
        }
}
