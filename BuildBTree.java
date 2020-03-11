

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BuildBTree {
    //用 index 表示前序遍历的根节点
    private int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder,int start,int end) {
        if(index >= preorder.length || start >= end) {
            return null;
        }
        //new 一个根节点
        TreeNode root = new TreeNode(preorder[index]);
        //在中序遍历找前序遍历根节点的位置 用i保存
        int i;
        for(i = 0;i<end;i++) {
            if(root.val == inorder[i]) {
                break;
            }
        }
        index++;
        //使用递归
        root.left = buildTree(preorder,inorder,start,i);
        root.right = buildTree(preorder,inorder,i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,0,inorder.length);
    }
}