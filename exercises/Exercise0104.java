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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        // root != null
        int maxD = 1;

        TreeNode left = root.left;
        if (left != null) maxD = Math.max(maxD, 1 + maxDepth(left));

        TreeNode right = root.right;
        if (right != null) maxD = Math.max(maxD, 1 + maxDepth(right));

        return maxD;
    }
}
