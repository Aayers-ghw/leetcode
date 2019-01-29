package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Invert_Binary_Tree {

//	//	�ݹ�
//	 public TreeNode invertTree(TreeNode root) {
//         if(root == null) return null;
//         TreeNode right = invertTree(root.right);
//         TreeNode left = invertTree(root.left);
//         root.left = right;
//         root.right = left;
//         return root;
//     }
	
	//����
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        return root;
    }
}
