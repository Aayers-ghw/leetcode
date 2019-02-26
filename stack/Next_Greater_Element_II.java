package stack;

public class Next_Greater_Element_II {

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        if(nums == null || nums.length == 0) return res;
        int[] doubleNums = new int[nums.length * 2];
        for(int i = 0; i < nums.length; ++i){
            doubleNums[i] = nums[i];
        }
        for(int i = nums.length; i < doubleNums.length; ++i){
            doubleNums[i] = nums[i - nums.length];
        }
        for(int i = 0; i < nums.length; ++i){
            res[i] = -1;
            for(int j = i + 1; j < doubleNums.length; ++j){
                if(nums[i] < doubleNums[j]){
                    res[i] = doubleNums[j];
                    break;
                }
            }
        }
        return res;
    }
}
