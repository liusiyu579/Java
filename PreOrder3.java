
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreOrder3 {
    public List<Integer> preorderTraversal(TreeNode root) {
        //1.借助栈
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root == null) {
            return new ArrayList<>();
        }
        //先让根节点root入栈
        s.push(root);
        while(!s.empty()){
            //让node一直沿左侧路径遍历  
            TreeNode node = s.pop();
            while(node != null) {
                list.add(node.val);
                //如果存在有孩子 就让节点入栈
                if(node.right != null) {
                    s.push(node.right);
                }
                node = node.left;
            }
        }
        return list;
    }
}