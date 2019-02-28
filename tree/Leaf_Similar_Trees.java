package tree;

import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return leaves1.equals(leaves2);
    } 
    public void dfs(TreeNode root, List<Integer> res){
        if(root == null) return;
        if(root.left == null && root.right == null){
            res.add(root.val);
        }
        dfs(root.left, res);
        dfs(root.right, res);
    } 
}
