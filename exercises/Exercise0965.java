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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        
        boolean leftVal = true, rightVal = true;

        // left branch
        TreeNode left = root.left;
        if (left != null) {
            if (left.val != root.val) return false;
            leftVal = isUnivalTree(left);
        }
        
        // right branch
        TreeNode right = root.right;
        if (right != null) {
            if (right.val != root.val) return false;
            rightVal = isUnivalTree(right);
        }
        
        return leftVal && rightVal;
    }
}
