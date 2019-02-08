package tree;

public class Maximum_Binary_Tree {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}
    public TreeNode helper(int[] nums, int start, int end){
        if(start > end) return null;
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = start; i <= end; ++i){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root =  new TreeNode(max);
        root.left = helper(nums, start, index - 1);
        root.right = helper(nums, index + 1, end);
        return root;
    }
}
