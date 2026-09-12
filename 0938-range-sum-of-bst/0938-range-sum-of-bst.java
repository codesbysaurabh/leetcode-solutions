/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int l, int h) {
        if(root==null) return 0;
        Sum(root,l,h);
        return sum; 
    }
    public void Sum(TreeNode root, int l, int h) {
        if(root==null) return;
        if(root.val<=h && root.val>=l) sum+=root.val;
        Sum(root.left,l,h);
        Sum(root.right,l,h);
        return;
    }

}