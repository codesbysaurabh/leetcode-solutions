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
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if(root==null) return new TreeNode(key);
        if(root.val < key){ // RST me attach karke aao
            root.right = insertIntoBST(root.right,key);
        } 
        else if(root.val > key){ // LST me attach karke aao
            root.left = insertIntoBST(root.left,key);
        } 
        return root;
    }
}