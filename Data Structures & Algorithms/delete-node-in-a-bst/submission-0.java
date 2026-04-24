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
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root == null) {
            return null;
        } else if(val > root.val) {
            root.right = deleteNode(root.right, val);
        } else if(val < root.val) {
            root.left = deleteNode(root.left, val);
        } else {
            if(root.right == null) {
                return root.left;
            } else if(root.left == null) {
                return root.right;
            } else {
                TreeNode node = findMin(root.right);
                root.val = node.val;
                root.right = deleteNode(root.right, node.val);
            }
        }
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        TreeNode curr = root;
        while(curr != null && curr.right != null) {
            curr = curr.right;
        }
        return curr;
    }
}