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
            } else {
                root.left = insert(root.left, val);
            }
        }
        return root;
    }

    public boolean search(TreeNode root, int val) {
        if(root == null) {
            return false;
        } else {
            if(root.val < val) {
                search(root.right, val);
            } else if(root.val > val) {
                search(root.left, val);
            } else if(root.val == val) {
                return true;
            }
        }
        return false;
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
                TreeNode temp = minNode(root);
                root.val = temp.val;
                root.right = delete(root.right, temp.val);
            }
        }
        return root;
    }

    public TreeNode minNode(TreeNode root) {
        TreeNode curr = root;
        while(curr != null) {
            curr = curr.left;
        }
        return curr;
    }

    public void addVal(int key) {
        root = insert(root, key);
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    public boolean contains(int key) {
        return search(root, key);
    }
}


class MyHashSet {

    final int size = 10000;
    BST[] node;

    public MyHashSet() {
        node = new BST[size];
        for (int i = 0; i < size; i++) {
            node[i] = new BST();
        }
    }
    
    public void add(int key) {
        int idx = key%size;
        if(!node[idx].contains(key)) {
            node[idx].addVal(key);
        }
    }
    
    public void remove(int key) {
        int idx = key%size;
        if(node[idx].contains(key)) {
            node[idx].delete(key);
        }
    }
    
    public boolean contains(int key) {
        int idx = key%size;
        return node[idx].contains(key);
    }


}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */