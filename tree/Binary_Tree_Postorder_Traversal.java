package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 102
 *
 */
public class Binary_Tree_Postorder_Traversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;
        TreeNode lastVisit = root;
        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.peek();
            if(curr.right == null || curr.right == lastVisit){
                res.add(curr.val);
                lastVisit = curr;
                stack.pop();
                curr = null;
            }else{
                curr = curr.right;
            }
        }
        return res;
    }
}
