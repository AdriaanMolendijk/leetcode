/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        
        if (root == null) return 0;
        List<Node> children = root.children;
        
        // children != null
        int maxD = 1;
        for (Node child : children) {
            maxD = Math.max(maxD, 1 + maxDepth(child));
        }
        return maxD;
    }
}