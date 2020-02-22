

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreOrder2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> List = new ArrayList<>();
        if(root == null){
            return List;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.empty()){
            TreeNode node = s.pop();
            List.add(Integer.valueOf(node.val));
            if(node.left != null){
                s.push(node.left);
            }
            if(node.right != null){
                s.push(node.right);
            }
        }
        return List;
    }
}