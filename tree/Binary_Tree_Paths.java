package tree;

import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Paths {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        if(root == null) return paths;
        construct_paths(root, "", paths);
        return paths;
    }
    public void construct_paths(TreeNode root, String path, List<String> paths){
        if(root != null){
            path += Integer.toString(root.val);
            if(root.left == null && root.right == null){
                paths.add(path);
                path = "";
            }
            path += "->";
            construct_paths(root.left, path, paths);
            construct_paths(root.right, path, paths);
        }
    }
}
