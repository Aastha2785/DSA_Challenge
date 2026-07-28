// 226. Invert Binary trees

public class tree_swap {
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
    static TreeNode swap(TreeNode root){
        if(root==null)
            return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        swap(root.left);
        swap(root.right);
        return root;
    }

    static void traverse(TreeNode root){
        if(root==null)
            return;
        traverse(root.left);
        System.out.println(root.val);
        traverse(root.right);
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
            System.out.println("before");
            traverse(n1);
            TreeNode x=swap(n1);
            System.out.println("after");
            traverse(x);


}
}
