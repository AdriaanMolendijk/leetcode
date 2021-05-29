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
    public List<Integer> preorder(Node root) {
        
        ArrayList<Integer> out = new ArrayList<Integer>();
        if (root == null) return out;
        out.add(root.val);
        
        List<Node> children = root.children;
        for (Node child : children) {
            out.addAll(preorder(child));
        }
        return out;
        
    }
}
