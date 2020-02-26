

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PostOrder2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.empty()){
            TreeNode node = s.pop();
            if(node.left != null){
                s.push(node.left);
            }
            if(node.right != null){
                s.push(node.right);
            }
            ret.add(0,node.val);
        }
        return ret;
    }
}