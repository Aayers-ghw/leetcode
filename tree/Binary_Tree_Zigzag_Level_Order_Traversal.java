package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Zigzag_Level_Order_Traversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
        List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
        if(root == null) return wrapList;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean order = true;
        while(!queue.isEmpty()){
            List<Integer> subList = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; ++i){
                TreeNode node = queue.poll();
                if(order){
                    subList.add(node.val);
                }else{
                    subList.add(0, node.val);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right !=null ){
                    queue.offer(node.right);
                }
            }
            order = !order;
            wrapList.add(subList);
        }
        return wrapList;
    }
}
