package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429
 *
 */
public class Nary_Tree_Level_Order_Traversal {

	public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0; i < size; ++i){
                for(Node node : queue.peek().children){
                    queue.offer(node);
                }
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}
