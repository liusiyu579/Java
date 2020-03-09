
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BTreeStr {
    public String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        String s = ""+t.val;
        if(t.left == null && t.right == null) {
            return s;
        }
        String left,right;
        left = (t.left == null) ? "()" : "(" + tree2str(t.left)+ ")";
        right = (t.right == null) ? "" : "(" +tree2str(t.right) + ")";

        return s+left+right;
    }
}