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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        if(root != null) {
            queue.add(root);
        }

        while(!queue.isEmpty()) {
            level = queue.size();
            TreeNode seen = null;
            for(int i=0; i<level; i++) {
                TreeNode curr = queue.poll();
                
                if(curr != null) {
                    seen = curr;
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            if(seen != null) {
                list.add(seen.val);
            }
        }
        return list;
    }
}
