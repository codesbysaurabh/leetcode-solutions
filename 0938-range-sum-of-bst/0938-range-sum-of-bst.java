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
    public int rangeSumBST(TreeNode root, int l, int h) {
        if(root==null) return 0;
        return Sum(root,l,h,0); 
    }
    public int Sum(TreeNode root, int l, int h,int sum) {
        if(root==null) return sum;
        if(root.val<=h && root.val>=l) sum+=root.val;
        sum = Sum(root.left,l,h,sum);
        sum = Sum(root.right,l,h,sum);
        return sum;
    }

}