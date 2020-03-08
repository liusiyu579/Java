


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ReBuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return reBuildTree(inorder,postorder,0,postorder.length,postorder.length);
    }
    public TreeNode reBuildTree(int[] inorder, int[] postorder,int inStart,int postEnd,int postLength) {
        if(postLength == 0) {
            return null;
        }
        int root = postorder[postEnd-1];
        TreeNode node = new TreeNode(root);
        if(postLength == 1) {
            return node;
        }
        for(int i = 0;i < postLength;i++) {
            if(root ==  inorder[inStart+i]) {
                node.left = reBuildTree(inorder,postorder,inStart,postEnd-postLength+i,i);
                node.right = reBuildTree(inorder,postorder,inStart+i+1,postEnd-1,postLength-i-1);
                break;
            }
        }
        return node;
    }
}