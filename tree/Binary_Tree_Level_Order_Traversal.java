package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 104
 *
 */
public class Binary_Tree_Level_Order_Traversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			List<Integer> subList = new ArrayList<>();
			int queueNum = queue.size();
			for(int i = 0; i < queueNum; ++i) {
				if(queue.peek().left != null)	queue.offer(queue.peek().left);
				if(queue.peek().right != null)	queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			wrapList.add(subList);
		}
		
		return wrapList;
	}
}
