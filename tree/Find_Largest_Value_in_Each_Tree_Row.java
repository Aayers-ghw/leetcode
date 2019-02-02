package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Find_Largest_Value_in_Each_Tree_Row {

	public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int size = q.size();
            for(int i = 0; i < size; ++i){
                TreeNode node = q.poll();
                if(max < node.val){
                    max = node.val;
                }
                if(node.left != null) q.offer(node.left);
                if(node.right != null)  q.offer(node.right);
            }
            res.add(max);
        }
        return res;
    }
}
