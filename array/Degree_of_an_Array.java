package array;

import java.util.HashMap;
import java.util.Map;

public class Degree_of_an_Array {
    public int findShortestSubArray(int[] nums) {
    	Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
        	if(map.containsKey(nums[i])){
        		map.get(nums[i])[1] = i;
        		map.get(nums[i])[2]++;
        	}else{
        		map.put(nums[i], new int[]{i, i, 1});
        	}
        	max = Math.max(max, map.get(nums[i])[2]);
        }
        int lenMin = Integer.MAX_VALUE;
        for(int num : map.keySet()){
        	if(map.get(num)[2] == max){
        		lenMin = Math.min(lenMin, map.get(num)[1] - map.get(num)[0] + 1);
        	}
        }
        return lenMin;
    }
}
