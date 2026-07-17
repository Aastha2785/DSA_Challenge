// traversal of binary tree 
// Leetcode questions 144, 94, 145
public class tree_trav {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static void preorder(TreeNode r){
        if(r==null){
            return;
        }
        System.out.print(r.val+"->");
        preorder(r.left);
        preorder(r.right);
    }
    static void inorder(TreeNode r){
        if(r==null){
            return;
        }
        inorder(r.left);
        System.out.print(r.val+"->");
        inorder(r.right);
    }
    static void postorder(TreeNode r){
        if(r==null){
            return;
        }
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.val+"->");
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
System.out.println("Preorder");
preorder(n1);
System.out.println();
System.out.println("Postorder");
postorder(n1);
System.out.println();
System.out.println("Inorder");
inorder(n1);
}
    }


