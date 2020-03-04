/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

class FindBTree {
	public void find(TreeNode root,int val) {
        if(root == null){
			return null;
		}
		if(root.val == val){
			return root;
		}
		TreeNode left = find(root.left,val);
		if(left != null){
			return left;
		}
		TreeNode right = find(root.right,val);
		if(right != null){
			return right;
		}
		return null;
}








