package array;

public class Find_the_Duplicate_Number {

    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length <= 0) return -1;
        
        for(int i = 0; i < nums.length; ++i){
            while(nums[i] != i + 1){
                if(nums[i] == nums[nums[i] - 1]){
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        return -1;
    }
}
