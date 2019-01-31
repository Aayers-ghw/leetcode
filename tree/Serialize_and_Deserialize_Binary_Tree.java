package tree;

import java.util.List;

public class Serialize_and_Deserialize_Binary_Tree {

	private StringBuffer sb = new StringBuffer();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            sb.append("null,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        serialize(root.left);
        serialize(root.right);
        
        return sb.toString();
    }

    public static TreeNode rdeserialize(List<String> l){
        if(l.get(0).equals("null")){
            l.remove(0);
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = rdeserialize(l);
        root.right = rdeserialize(l);
        
        return root;
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }
}
