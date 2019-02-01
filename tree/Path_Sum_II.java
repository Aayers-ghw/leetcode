package tree;

import java.util.LinkedList;
import java.util.List;

public class Path_Sum_II {

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> Result = new LinkedList<List<Integer>>();
        if(root == null)    return Result;
        List<Integer> currentResult = new LinkedList<>();
        pathSum(root, sum, currentResult, Result);
        return Result;
    }
    
    public void pathSum(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> Result){
        if(root == null) return;
        
        currentResult.add(root.val);
        if(root.left == null && root.right == null && root.val == sum){
            Result.add(new LinkedList(currentResult));
            currentResult.remove(currentResult.size() - 1);
            return;
        }else{
            pathSum(root.left, sum - root.val, currentResult, Result);
            pathSum(root.right, sum - root.val, currentResult, Result);
        }
        currentResult.remove(currentResult.size() - 1);
    }
}
