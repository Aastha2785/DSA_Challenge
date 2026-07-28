// 100. Same tree
//  finding whether two given trees are same or not
public class tree_identical {
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

    static boolean identical(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        else if(p!=null && q==null)
            return false;
        else if(p==null && q!=null)
            return false;

        if(p.val!=q.val)
            return false;
        boolean l=identical(p.left,q.left);
        boolean r=identical(p.right,q.right);

        if(l==false || r==false)
            return false;

        return true;

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


TreeNode m1=new TreeNode(6);
TreeNode m2=new TreeNode(7);
TreeNode m3=new TreeNode(5);
TreeNode m4=new TreeNode(1);
TreeNode m5=new TreeNode(8);
TreeNode m6=new TreeNode(3);
m1.left=m6;
m1.right=m2;
m6.right=m3;
m6.left=m4;
m2.right=m5;
boolean x=identical(n1, m1);
if(x==false)
    System.out.println("Not Identical");
else
    System.out.println("Identical");
}
}
