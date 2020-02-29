

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IsBalance {
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int a = height(root.left);
        int b = height(root.right);
        if(a>=0 && b>=0 && (a - b == 1 || b-a == 1 || a == b)){
            return Math.max(a,b)+1;
        }else {
            return -1;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return height(root)>=0;
    }
}