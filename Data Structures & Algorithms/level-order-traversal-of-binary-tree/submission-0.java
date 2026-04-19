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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> list = new ArrayList<>();
		int levelOrder = 0;

        if(root != null)
			queue.add(root);
		
		while(!queue.isEmpty()) {
			List<Integer> elementList = new ArrayList<>();
            levelOrder = queue.size();
            for(int i=0; i<levelOrder; i++) {
                TreeNode curr = queue.poll();
                elementList.add(curr.val);
                
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
            list.add(elementList);
		}
		return list;
    }
}
