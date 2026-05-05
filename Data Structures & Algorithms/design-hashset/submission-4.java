class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}

class BST {
    private TreeNode root;

    public TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
        }else {
            if(val>root.val) {
                root.right = insert(root.right, val);
            } else if(val < root.val) {
                root.left = insert(root.left, val);
            }
        }
        return root;
    }

    public TreeNode delete(TreeNode node, int key) {
        if (node == null) return null;
        if (key < node.val) node.left = delete(node.left, key);
        else if (key > node.val) node.right = delete(node.right, key);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            TreeNode temp = minValueNode(node.right);
            node.val = temp.val;
            node.right = delete(node.right, temp.val);
        }
        return node;
    }

    private TreeNode minValueNode(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public boolean search(TreeNode root, int val) {
        if(root == null) {
            return false;
        }
        if(root.val == val) {
            return true;
        }else {
            if(val>root.val) {
                return search(root.right, val);
            } else if(val < root.val) {
                return search(root.left, val);
            }
        }
        return false;
    }

    public void add(int key) {
        root = insert(root, key);
    }

    public void remove(int key) {
        root = delete(root, key);
    }

    public boolean contains(int key) {
        return search(root, key);
    }
}

class MyHashSet {

    private final int size = 10000;
    private BST[] buckets;

    public MyHashSet() {
        buckets = new BST[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new BST();
        }
    }

    private int hash(int key) {
        return key % size;
    }

    public void add(int key) {
        int idx = hash(key);
        if (!buckets[idx].contains(key)) {
            buckets[idx].add(key);
        }
    }

    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].remove(key);
    }

    public boolean contains(int key) {
        int idx = hash(key);
        return buckets[idx].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */