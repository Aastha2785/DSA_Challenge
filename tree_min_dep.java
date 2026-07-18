// 111 Minimum depth of the binary tree
// again used the recursive technique
public class tree_min_dep {
    
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
    static int mindepth(TreeNode r){
        if(r==null)
            return 0;
        if(r.right==null){
            return 1+mindepth(r.left);
        }
        if(r.left==null){
            return 1+mindepth(r.right);
        }
        int l=mindepth(r.left);
        int ri=mindepth(r.right);
        return 1+Math.min(l,ri);

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
int x= mindepth(n1);
System.out.println(x);
    }
}
