class Solution {
    List<Integer> list1;
    List<Integer> list2;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
            
        preOrder1(p);
        preOrder2(q);

        boolean isEqual = true;

        if (list1.size() != list2.size()) return false;

        for(int i=0; i<list1.size(); i++) {
            Object a = list1.get(i);
            Object b = list2.get(i);
            if(!Objects.equals(a, b)) {
                return false;
            }
        }

        return isEqual;
        
    }

    void preOrder1(TreeNode node) {
        if(node == null) {
            list1.add(null);
            return;
        }
        list1.add(node.val);
        preOrder1(node.left);
        preOrder1(node.right);
        
    }

    void preOrder2(TreeNode node) {
        if(node == null) {
            list2.add(null);
            return;
        }
        list2.add(node.val);
        preOrder2(node.left);
        preOrder2(node.right);
        
    }
}