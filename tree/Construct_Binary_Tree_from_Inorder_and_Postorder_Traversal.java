package tree;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return constructTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    public TreeNode constructTree(int[] inorder, int il, int ir, int[] postorder, int pl, int pr){
        if(il > ir || pl > pr) return null;
        
        TreeNode root = new TreeNode(postorder[pr]);
        for(int i = il; i <= ir; ++i){
            if(postorder[pr] == inorder[i]){
                root.left = constructTree(inorder, il, i - 1, postorder, pl, pl + i - il - 1);
                root.right = constructTree(inorder, i + 1, ir, postorder, pl + i - il, pr - 1);
            }
        }
        return root;
    } 
}
