package tree;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode constructTree(int[] preorder, int pl, int pr, int[] inorder, int il, int ir){
        if(pl > pr || il > ir)  return null;
        
        TreeNode root = new TreeNode(preorder[pl]);
        for(int i = il; i <= ir; ++i){
            if(preorder[pl] == inorder[i]){
                root.left = constructTree(preorder, pl + 1, pl + i - il, inorder, il, i - 1);
                root.right = constructTree(preorder, pl + i - il + 1, pr, inorder, i + 1, ir);
            }
        }
        return root;
    }
}
