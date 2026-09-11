class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        dfs(root, arr, ans, sum);

        return ans;
    }

    private void dfs(TreeNode root, List<Integer> arr,
                     List<List<Integer>> ans, int sum) {

        if (root == null) return;

        arr.add(root.val);

        if (root.left == null && root.right == null && sum == root.val) {
            ans.add(new ArrayList<>(arr));
        }

        dfs(root.left, arr, ans, sum - root.val);
        dfs(root.right, arr, ans, sum - root.val);

        arr.remove(arr.size() - 1);
    }
}