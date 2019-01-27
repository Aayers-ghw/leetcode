package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94
 *
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Binary_Tree_Inorder_Traversal {

//	// µ›πÈ
//	List<Integer> list = new ArrayList<Integer>();
//
//	public List<Integer> inorderTraversal(TreeNode root) {
//		preOrder(root);
//		return list;
//	}
//
//	public void preOrder(TreeNode root) {
//		if (root == null)
//			return;
//		preOrder(root.left);
//		list.add(root.val);
//		preOrder(root.right);
//	}
	
	//”√’ª
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		TreeNode curr = root;
		while(curr != null || !st.isEmpty()) {
			while(curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			list.add(curr.val);
			curr = curr.right;
		}
		return list;
	}
	
}
