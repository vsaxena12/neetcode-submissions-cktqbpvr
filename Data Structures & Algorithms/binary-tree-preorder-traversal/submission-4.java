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
    private Stack<TreeNode> stack;
    public List<Integer> preorderTraversal(TreeNode root) {

        list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        
        stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if(curr.right != null) {
                stack.push(curr.right);
            }
            if(curr.left != null) {
                stack.push(curr.left);
            }
        }
        
        return list;
    }

    
}