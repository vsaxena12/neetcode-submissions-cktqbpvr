class ListNode {
    int data;
    ListNode next;
    public ListNode(int val) {
        this.data = val;
        this.next = null;
    }
}

class MyHashSet {
    private ListNode[] list;
    private int hash;

    public MyHashSet() {
        this.list = new ListNode[10000];
        for(int i=0; i<list.length; i++) {
            this.list[i] = new ListNode(-1);
        }
    }
    
    public void add(int key) {
        hash = key%list.length;
        ListNode curr = list[hash];

        while(curr.next != null) {
            if(curr.next.data == key) {
                return;
            }
            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }

    public void remove(int key) {
        hash = key%list.length;
        ListNode curr = list[hash];

        while(curr.next != null) {
            if (curr.next.data == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    public boolean contains(int key) {
        hash = key%list.length;
        ListNode curr = list[hash];

        while(curr.next != null) {
            if (curr.next.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */