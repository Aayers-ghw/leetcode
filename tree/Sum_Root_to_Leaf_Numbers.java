package tree;

import java.util.LinkedList;
import java.util.List;

public class Sum_Root_to_Leaf_Numbers {

//	private int sum = 0;
//    public int sumNumbers(TreeNode root) {
//        if(root == null) return 0;
//        List<Integer> currentResult = new LinkedList<>();
//        sumNumbers(root, currentResult);
//        return sum;
//    }
//    
//    public void sumNumbers(TreeNode root, List<Integer> currentResult){
//        if(root == null) return;
//        currentResult.add(root.val);
//        if(root.left == null && root.right == null){
//            int temp = 0;
//            for(int i = 0; i < currentResult.size(); ++i){
//                temp = temp * 10 + currentResult.get(i);
//            } 
//            sum += temp;
//            currentResult.remove(currentResult.size() - 1);
//            return;
//        }else{
//            sumNumbers(root.left, currentResult);
//            sumNumbers(root.right, currentResult);
//        }
//        currentResult.remove(currentResult.size() - 1);
//    }
	
	int total = 0;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return total;
    }
    public void helper(TreeNode root, int sum){
        if(root == null) return;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            total += sum;
            return;
        }
        helper(root.left, sum);
        helper(root.right, sum);
    }
}
