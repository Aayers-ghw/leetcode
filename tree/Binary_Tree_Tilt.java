package tree;

public class Binary_Tree_Tilt {

	private int ans = 0;
    public int findTilt(TreeNode root) {
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        ans += Math.abs(left - right);
        return root.val + left + right;
    }
}
