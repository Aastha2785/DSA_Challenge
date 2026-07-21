// 110. Balanced binary tree
// recursive approach
public class tree_height {
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
static int height(TreeNode root){
    if(root==null){
        return 0;
    }
    int l=height(root.left);
    if(l==-1)
        return -1;
    int r=height(root.right);
    if(r==-1)
        return -1;
    if(Math.abs(r-l)>1)
        return -1;
    return Math.max(r,l)+1;
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

            int x=height(n1);
            if(x!=-1)
                System.out.println("Balanced");
            else
                System.out.println("Unbalanced");
            
    }
}
