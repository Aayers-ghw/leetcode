package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Univalued_Binary_Tree {

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int value = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val != value){
                return false;
            }
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        return true;
    }
}
