class Solution {
    // public TreeNode invert(TreeNode root) {
    //     if(root==null) return root;
    //     TreeNode temp = new TreeNode();
    //     temp=root.left;
    //     root.left=root.right;
    //     root.right=temp;

    //     invert(root.left);
    //     invert(root.right);

    //     return root;
    // }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        if(!helper(p.left,q.right)) return false;
        if(!helper(p.right,q.left)) return false;
        return true;
    }
}