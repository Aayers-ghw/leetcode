package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        helper(list, new ArrayList<>(), nums, 0);
        return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<Integer>(tempList));
            return;
        }
        for(int i = 0; i < nums.length; ++i){
            if(tempList.contains(nums[i]))  continue;
            tempList.add(nums[i]);
            helper(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
