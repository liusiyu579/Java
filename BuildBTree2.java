/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BuildBTree2 {
    //index 用来保存根节点的下标
    public int index = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder,int start,int end) {
        if(index < 0 || start >= end) {
            return null;
        }
        //new 一个根节点
        TreeNode root  = new TreeNode(postorder[index]);
        //用 i 来保存 中序遍历中的根节点
        int i;
        for(i = 0;i<end;i++) {
            if(root.val == inorder[i]) {
                break;
            }
        }
        --index;
        root.right = buildTree(inorder,postorder,i+1,end);
        root.left = buildTree(inorder,postorder,start,i);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length-1;
        return buildTree(inorder,postorder,0,inorder.length);
    }
}