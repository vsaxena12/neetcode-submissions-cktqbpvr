class LinkedList {
    private int key;
    private LinkedList next;
    public LinkedList(int data) {
        this.key = data;
        this.next = null;
    }
}

class MyHashSet {

    private LinkedList[] list; 
    private int hash;
    private int size;

    public MyHashSet() {
        this.list = new LinkedList[10001];
        for(int i=0; i<this.list.length; i++) {
            this.list[i] = new LinkedList(0);
        }
    }
    
    public void add(int key) {
        hash = key % this.list.length;
        LinkedList curr = this.list[hash];
        while( curr.next != null) {
            if(curr.next.key == key) {
                return;
            }
            curr = curr.next;
        }
        curr.next = new LinkedList(key);
    }
    
    public void remove(int key) {
        hash = key % this.list.length;
        LinkedList curr = this.list[hash];
        while( curr.next != null) {
            if(curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        hash = key % this.list.length;
        LinkedList curr = this.list[hash];
        while( curr.next != null) {
            if(curr.next.key == key) {
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