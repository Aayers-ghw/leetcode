package tree;

public class Delete_Node_in_a_BST {

	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        TreeNode p = root;
        TreeNode pp = null;
        while(p != null && p.val != key){
            pp = p;
            if(p.val < key){
                p = p.right;
            }else{
                p = p.left;
            }
        }
        
        if(p == null) return root;
        
        while(p.left != null && p.right != null){
            TreeNode minP = p.right;
            TreeNode minPP = p;
            while(minP.left != null){
                minPP = minP;
                minP = minP.left;
            }
            p.val = minP.val;
            p = minP;
            pp = minPP;
        }
        
        TreeNode child;
        if(p.left != null){
            child = p.left;
        }else if(p.right != null){
            child = p.right;
        }else{
            child = null;
        }
        
        if(pp == null){
            root = child;
        }else if(pp.left == p){
            pp.left = child;
        }else{
            pp.right = child;
        }
        
        return root;
    }
}
