package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Count_Complete_Tree_Nodes {

//	//±©Á¦
//	public int countNodes(TreeNode root) {
//        if(root == null) return 0;
//        Queue<TreeNode> q = new LinkedList<>();
//        int num = 1;
//        q.offer(root);
//        while(!q.isEmpty()){
//            TreeNode node = q.poll();
//            if(node.left != null){
//                num++;
//                q.offer(node.left);
//            }
//            if(node.right != null){
//                num++;
//                q.offer(node.right);
//            }
//        }
//        return num;
//    }
	
	//µÝ¹é
	public int countNodes(TreeNode root) {
		if(root == null)    return 0;
        TreeNode pLeft = root;
        TreeNode pRight = root;
        int hLeft = 0;
        int hRight = 0;
        
        while(pLeft != null){
            hLeft++;
            pLeft = pLeft.left;
        }
        while(pRight != null){
            hRight++;
            pRight = pRight.right;
        }
        
        if(hLeft == hRight){
            return (int)Math.pow(2, hLeft) - 1;
        }else {
        	return countNodes(root.left) + countNodes(root.right) + 1;
        }
        
	}
}
