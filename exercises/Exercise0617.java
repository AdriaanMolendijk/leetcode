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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        
        // root1 or root2 non null
        TreeNode merge;
        if (root1 == null) {
            merge = root2;
        } else if (root2 == null) {
            merge = root1;
        } else {
            // both are non null
            merge = new TreeNode(root1.val + root2.val);
            merge.left = mergeTrees(root1.left, root2.left);
            merge.right = mergeTrees(root1.right, root2.right);
        }
        return merge;
    }
}