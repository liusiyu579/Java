
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class reBTreeStr {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        reTree2str(t,sb);
        return sb.toString();
    }
    public void reTree2str(TreeNode t,StringBuilder sb ) {
        if(t != null) {
            sb.append(t.val);
            if(t.left != null || t.right != null) {
                sb.append("(");
                reTree2str(t.left,sb);
                sb.append(")");
                if(t.right != null) {
                    sb.append("(");
                    reTree2str(t.right,sb);
                    sb.append(")");
                }
            }
        }
    }
}