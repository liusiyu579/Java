
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LowestCommonAncestor {
	//获取节点的路径
    public boolean getPath(TreeNode root,TreeNode q,Stack<TreeNode> s) {
        if(root == null) {
            return   false;
        }
        s.push(root);
        if(root == q) {
            return true;
        }
        if(getPath(root.left,q,s) || getPath(root.right,q,s)) {
            return true;
        } 
		
        s.pop();
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) {
            return null;
        }
        Stack<TreeNode> sp = new Stack<>();
        Stack<TreeNode> sq = new Stack<>();
		
        getPath(root,p,sp);
        getPath(root,q,sq);
		
        int sizep = sp.size();
        int sizeq = sq.size();

        while(sizep>0 && sizeq>0) {
			//如果两个栈长度不相等 让size大的先走 
			//长度相等 在进行一一比较
            if(sizep>sizeq) {
                sp.pop();
                sizep--;
            }else if(sizep<sizeq){
                sq.pop();
                sizeq--;
            }else {
                if(sp.peek() == sq.peek()) {
                    return sp.peek();
                }else {
                    sp.pop();
                    sq.pop();
                }
            }
        }
        return null;
    }
}