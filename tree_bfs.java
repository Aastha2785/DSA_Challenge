// 102 bINARY TREE LEVEL ORDER TRAVERSAL
import java.util.*;
public class tree_bfs {
    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static void level(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!(q.isEmpty())){
        int s=q.size();
        for(int i=0;i<s;i++){
            TreeNode x=q.poll();
            System.out.print(x.val+" ");
            if(x.left!=null)
                q.offer(x.left);
            if(x.right!=null)
                q.offer(x.right);
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        TreeNode n1=new TreeNode(6);
TreeNode n2=new TreeNode(7);
TreeNode n3=new TreeNode(5);
TreeNode n4=new TreeNode(4);
TreeNode n5=new TreeNode(8);
TreeNode n6=new TreeNode(3);
n1.left=n6;
n1.right=n2;
n6.right=n3;
n6.left=n4;
n2.right=n5;
level(n1);
    }
}
