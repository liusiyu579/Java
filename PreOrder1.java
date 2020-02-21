

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreOrder1 {
    public void preOrder(List<Integer> List,TreeNode root){
        if(root == null){
            return;
        }else {
            List.add(root.val);
            preOrder(List,root.left);
            preOrder(List,root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> List = new ArrayList<>();
        if(root == null){
            return List;
        }
        else {
            preOrder(List,root);
        }
        return List;
    }
}