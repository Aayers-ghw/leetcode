package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 589
 *
 */
public class Nary_Tree_Preorder_Traversal {

	List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return res;
        
        res.add(root.val);
        for(Node node : root.children){
            preorder(node);
        }
        return res;
    }
}
