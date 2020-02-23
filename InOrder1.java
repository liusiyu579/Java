

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
class InOrder1 {
    public void inOrder(List<Integer> List,TreeNode root){
        if(root == null){
            return;
        }else {
            inOrder(List,root.left);
            List.add(root.val);
            inOrder(List,root.right);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> List = new ArrayList<>();
        if(root == null){
            return List;
        }
        else {
            inOrder(List,root);
        }
        return List;
    }
}