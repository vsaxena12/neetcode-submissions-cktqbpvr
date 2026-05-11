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
 * Root, Left, Right
 */
class Solution {
    private List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();

        preorder(root);

        // if(root == null)
        //     return list;

        // Stack<TreeNode> stack = new Stack<>();
        // TreeNode curr = root;
        // stack.push(curr); 

        // while(!stack.isEmpty()) {
        //     curr = stack.pop();
        //     list.add(curr.val);
        //     if(curr.right != null) {
        //         stack.push(curr.right);
        //     }
        //     if(curr.left != null) {
        //         stack.push(curr.left);
        //     }
        // }
        return list;
    }

    private void preorder(TreeNode root) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}