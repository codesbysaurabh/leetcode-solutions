class Triplet {
    int max;
    int min;
    boolean isBST;

    Triplet(int max, int min, boolean isBST) {
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}

class Solution {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return maxMin(root).isBST;
    }

    Triplet maxMin(TreeNode root) {
        if (root == null) {
            return new Triplet(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }

        Triplet left = maxMin(root.left);
        Triplet right = maxMin(root.right);

        int max = Math.max(root.val, Math.max(left.max, right.max));
        int min = Math.min(root.val, Math.min(left.min, right.min));

        boolean isBST = left.isBST &&
                        right.isBST &&
                        (root.left == null || left.max < root.val) &&
                        (root.right == null || right.min > root.val);

        return new Triplet(max, min, isBST);
    }
}