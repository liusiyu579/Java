

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
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
public class PrintBTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> List = new ArrayList<>();
        if(root == null){
            return List;
        }
        Queue<TreeNode> q=new LinkedList<>();
        
        List.add(root.val);
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode node = q.peek();
            
            if(node.left != null){
                List.add(node.left.val);
                q.offer(node.left);
            }
            
            if(node.right != null){
                List.add(node.right.val);
                q.offer(node.right);
            }
            q.poll();
        }
        return List;
    }
}