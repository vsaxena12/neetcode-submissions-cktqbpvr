/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head; 
        ListNode result = new ListNode(-1);
        ListNode dummy = result;

        while(temp != null) {
            ListNode curr = temp.next;
            temp.next = null;
            list.add(temp);
            temp = curr;
        }

        int i=0;
        int j = list.size()-1;

        while(i<j) {
            list.get(i).next = list.get(j);
            i++;
            // if (i >= j) {
            //     break;
            // }
            list.get(j).next = list.get(i);
            j--;
        }

        list.get(i).next = null;
    }
}
