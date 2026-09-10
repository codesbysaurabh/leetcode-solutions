class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>(); q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                level.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            ans.add(level);
        }
        return ans;
    }
}

//USING PAIR CLASS 
// import java.util.*;
// class Solution {
//     public class pair {
//         TreeNode node;
//         int level;
//         pair(TreeNode node,int level){
//             this.node = node;
//             this.level=level;
//         }
//     }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         Queue<pair> q = new LinkedList<>();
//         int currLevel=0;

//         List<List<Integer>> ans = new ArrayList<>();
        
//         if(root==null) return ans;


//         q.add(new pair(root,0));
//         while(q.size()>0){
//             pair front = q.remove();
//             TreeNode node = front.node;
//             int level = front.level;

//             if(level!=currLevel){
//                 currLevel++;
//                 ans.add(new ArrayList<>());
//             }

//             if(ans.size()==0) ans.add(new ArrayList<>());

//             ans.get(currLevel).add(node.val);

//             //add element to new list
//             if(node.left!=null) q.add(new pair(node.left,level+1));
//             if(node.right!=null) q.add(new pair(node.right,level+1));

//         }
//         return ans;

//     }
// }