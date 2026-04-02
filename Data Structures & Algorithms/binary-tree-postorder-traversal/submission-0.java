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
    private List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();

        postOrder(root);
        return list;
    }

    void postOrder(TreeNode node) {
        if(node == null)
            return;
        
        postOrder(node.left);
        postOrder(node.right);
        list.add(node.val);
        
    }
    
}