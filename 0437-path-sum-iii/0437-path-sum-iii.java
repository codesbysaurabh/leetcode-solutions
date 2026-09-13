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
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);

        dfs(root, 0, targetSum, map);

        return count;
    }

    private void dfs(TreeNode root, long currSum, int targetSum,
                      HashMap<Long, Integer> map) {

        if (root == null) return;

        currSum += root.val;

        // Check if there is a previous prefix sum
        count += map.getOrDefault(currSum - targetSum, 0);

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        dfs(root.left, currSum, targetSum, map);
        dfs(root.right, currSum, targetSum, map);

        // Backtrack
        map.put(currSum, map.get(currSum) - 1);
    }
}