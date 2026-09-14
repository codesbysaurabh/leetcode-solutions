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
class Quad {
    int max;
    int min;
    int sum;
    boolean isBST;

    Quad(int max, int min, int sum, boolean isBST) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}

class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }
    static Quad helper(TreeNode root) {
        if (root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        Quad left = helper(root.left);
        Quad right = helper(root.right);
        boolean isBST = left.isBST && right.isBST && left.max < root.val && right.min > root.val;
        if (isBST) {
            int sum = root.val + left.sum + right.sum;
            maxSum = Math.max(maxSum, sum);
            int max = Math.max(root.val, right.max);
            int min = Math.min(root.val, left.min);
            return new Quad(max, min, sum, true);
        }
        return new Quad(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, false);
    }
}