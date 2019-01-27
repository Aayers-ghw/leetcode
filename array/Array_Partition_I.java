package array;

import java.util.Arrays;

public class Array_Partition_I {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int minSum = 0;
        for(int i = 0; i < nums.length; i += 2){
        	minSum += nums[i];
        }
        return minSum;
    }
}
