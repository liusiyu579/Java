
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CompleteTree {
	public boolean completeTree(TreeNode root) {
		//空树也是完全二叉树
		if(root == null) {
			return true;
		}
		
		//树非空
		
		//借助队列
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		//标记
		boolean isLeafOrChild = false;
		while(!q.empty()) {
			//按照层序遍历 找到第一个孩子不全的节点(叶子节点或者只有一个孩子的节点)
			TreeNode cur = q.poll();
			if(isLeafOrChild) {
				//如果是叶子节点或者只有左孩子
				//从这个节点开始不能有孩子
				if(cur.left != null || cur.right != null) {
					return false;
				}
			}else {
				//同时拥有左右孩子的入栈
				if(cur.left != null && cur.right != null) {
					q.offer(cur.left);
					q.offer(cur.right);
				}else if(cur.right != null) {
					//只有右孩子
					return false;
				}else if(cur.left != null) {
					//只有左孩子
					q.offer(cur.left);
					isLeafOrChild = true;
				}else {
					//叶子节点
					isLeafOrChild = true;
				}
			}
		}
		return true;
	}
}
    
    