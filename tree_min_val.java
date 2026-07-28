

public class tree_min_val {
    static int x=-1;
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
static int max_val(TreeNode r){
    if(r==null)
        return x;
    if(x<r.val)
        x=r.val;
    max_val(r.left);
    max_val(r.right);

    return x;
}
public static void main(String arg[]){
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

            int y=max_val(n1);
            System.out.println(y);
}
}
