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
    public int maxlevel=-1;
    public int ans=0;
    public int findBottomLeftValue(TreeNode root) {
        level(root,0);
        return ans;
    }
    public void level(TreeNode root,int level){
        if(root==null) return;
        if(maxlevel<level){
            maxlevel=level;
            ans=root.val;
        }
        level(root.left,level+1);
        level(root.right,level+1);
    }
}