

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InOrder2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> List = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while(root != null || !s.empty()){
            while(root != null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            List.add(root.val);
            root = root.right;
        }
        return List;
    }
}