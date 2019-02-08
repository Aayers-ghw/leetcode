package tree;

public class Sum_of_Left_Leaves {

	private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return sum;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        helper(root.right);
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
    }
}
