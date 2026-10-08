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
    static class Pair {
        TreeNode node;
        int time;

        Pair(TreeNode node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        TreeNode startNode = findParent(root, start, parent);

        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        q.add(new Pair(startNode, 0));
        visited.add(startNode);

        int ans = 0;

        while (!q.isEmpty()) {
            Pair curr = q.remove();
            TreeNode node = curr.node;
            int time = curr.time;

            ans = Math.max(ans, time);

            if (node.left != null && visited.add(node.left)) {
                q.add(new Pair(node.left, time + 1));
            }

            if (node.right != null && visited.add(node.right)) {
                q.add(new Pair(node.right, time + 1));
            }

            if (parent.containsKey(node) && visited.add(parent.get(node))) {
                q.add(new Pair(parent.get(node), time + 1));
            }
        }

        return ans;
    }

    private TreeNode findParent(
        TreeNode root,
        int start,
        HashMap<TreeNode, TreeNode> parent
    ) {
        if (root.val == start) {
            return root;
        }

        if (root.left != null) {
            parent.put(root.left, root);
            TreeNode found = findParent(root.left, start, parent);
            if (found != null) return found;
        }

        if (root.right != null) {
            parent.put(root.right, root);
            TreeNode found = findParent(root.right, start, parent);
            if (found != null) return found;
        }

        return null;
    }
}