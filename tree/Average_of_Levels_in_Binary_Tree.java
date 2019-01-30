package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {

	//²ã´Î±éÀú
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0;
            for(int i = 0; i < size; ++i){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null)   q.offer(node.left);
                if(node.right != null)  q.offer(node.right);
            }
            res.add(sum/size);            
        }
        return res;
    }
}
