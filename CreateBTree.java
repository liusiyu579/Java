


import java.util.Scanner;
class BTNode{
     BTNode left = null;
     BTNode right = null;
     char val;
    public BTNode(char val) {
        this.val = val;
    }
}
class CreateBTree {
    private BTNode root = null;
    public int index = 0;
    //构造方法
    public BinTree(String s,char invaild) {
        root = createBTree(s,invaild);
    }
    public BTNode createBTree(String s,char invaild) {
        //1.定义一个新的根节点
        BTNode newRoot = null;
        while(index < s.length() && s.charAt(index) != invaild) {
            //2.invaild 表示 无用的节点
            newRoot = new BTNode(s.charAt(index));
            
            //递归下去 构造左右子树
            ++index;
            newRoot.left = createBTree(s,invaild);
            ++index;
            newRoot.right = createBTree(s,invaild);
        }
        return newRoot;
    }
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(BTNode root){
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
}
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            BinTree bt = new BinTree(s,'#');
            bt.inOrder();
        }
    }
}