class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}

class BST {
    TreeNode root; 

    public TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        } else {
            if(root.val < val) {
                root.right = insert(root.right, val);
            } else if (root.val > val) {
                root.left = insert(root.left, val);
            }
        }
        return root;
    }

    public boolean search(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        return (val < root.val) ? search(root.left, val) : search(root.right, val);
    }

    public TreeNode delete(TreeNode root, int val) {
        if(root == null) {
            return null;
        } else {
            if(root.val < val) {
                root.right = delete(root.right, val);
            } else if(root.val > val) {
                root.left = delete(root.left, val);
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode temp = minNode(root.right);
                root.val = temp.val;
                root.right = delete(root.right, temp.val);
            }
        }
        return root;
    }

    public TreeNode minNode(TreeNode root) {
        TreeNode curr = root;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}


class MyHashSet {

    final int size = 10001;
    BST node;
    TreeNode[] roots;

    public MyHashSet() {
        node = new BST();
        roots = new TreeNode[size];
    }
    
    public void add(int key) {
        int idx = key%size;
        roots[idx] = node.insert(roots[idx], key);
        
    }
    
    public void remove(int key) {
        int idx = key%size;
        roots[idx] = node.delete(roots[idx], key);
    }
    
    public boolean contains(int key) {
        int idx = key%size;
        return node.search(roots[idx], key);
    }


}