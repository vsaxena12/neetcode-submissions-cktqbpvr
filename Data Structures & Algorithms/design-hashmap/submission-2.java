class TreeNode {
    int key;
    int val;
    TreeNode left, right;
    public TreeNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class BST {

    public TreeNode insert(TreeNode root, int key, int val) {
        if(root == null) {
            return new TreeNode(key, val);
        } else {
            if(root.key < key) {
                root.right = insert(root.right, key, val);
            } else if(root.key > key) {
                root.left = insert(root.left, key, val);
            } else {
                root.val = val;
            }
        }
        return root;
    }

    public TreeNode delete(TreeNode root, int key) {
        if(root == null) {
            return null;
        } else {
            if(root.key < key) {
                root.right = delete(root.right, key);
            } else if(root.key > key) {
                root.left = delete(root.left, key);
            } else if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            } else {
                TreeNode temp = minNode(root.right);
                root.key = temp.key;
                root.val = temp.val;
                root.right = delete(root.right, temp.key);
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

    public int search(TreeNode root, int key) {
        if (root == null) return -1;
        if (root.key == key) return root.val;
        return (key < root.key) ? search(root.left, key) : search(root.right, key);
    }

    public boolean contains(TreeNode root, int key) {
        if(root == null) {
            return false;
        } else {
            if(root.key < key) {
                return contains(root.right, key);
            } else if (root.key > key) {
                return contains(root.left, key);
            } else {
                return true;
            }
        }
    }
}

class MyHashMap {

    private final int size = 1000;
    private BST bstLogic;
    private TreeNode[] roots;

    public MyHashMap() {
        bstLogic = new BST();
        roots = new TreeNode[size];
    }
    
    public void put(int key, int value) {
        int idx = key % size;
        roots[idx] = bstLogic.insert(roots[idx], key, value);
    }
    
    public int get(int key) {
        int idx = key % size;
        return bstLogic.search(roots[idx], key);
    }
    
    public void remove(int key) {
        int idx = key % size;
        roots[idx] = bstLogic.delete(roots[idx], key);
    }
}