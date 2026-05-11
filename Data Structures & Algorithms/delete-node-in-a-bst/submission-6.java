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
        } else if(root.val < val) {
            root.right = deleteNode(root.right, val);
        } else if(root.val > val) {
            root.left = deleteNode(root.left, val);
        } else {
            if(root.right == null) {
                return root.left;
            } else if(root.left == null) {
                return root.right;
            } else {
                TreeNode temp = minNode(root.right);
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);
            }
        }
        return root;
    }

    private TreeNode minNode(TreeNode root) {
        TreeNode temp = root;
        while(temp != null && temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
}