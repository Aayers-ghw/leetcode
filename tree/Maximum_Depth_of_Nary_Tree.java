package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 559
 *
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Maximum_Depth_of_Nary_Tree {

//	//递归
//	public int maxDepth(Node root) {
//        if(root == null) return 0;
//        else if(root.children == null){
//            return 1;
//        }else{
//            int max = 0;
//            for(Node item : root.children){
//                int temp = maxDepth(item);
//                if(max < temp){
//                    max = temp;
//                }
//            }   
//            return max + 1;
//        }
//        
//    }
	
	//按层遍历的思想
	public int maxDepth(Node root) {
		if(root == null) return 0;
		
		int depth = 0;
		Queue<Node> queue = new LinkedList<>();
		
		queue.offer(root);
		while(!queue.isEmpty()) {
            int size = queue.size();
			for(int i = 0; i < size; ++i){
                Node curr = queue.poll();
                for(Node node : curr.children){
                    queue.offer(node);
                }
            }
			depth++;
		}
		
		return depth;
	}
	
}
