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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int counter = 0;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        int index = counter - n;

        ListNode curr = head;

        if (index == 0) {
            return head.next;
        }
       
        int c = 0;
        while(curr != null) {
            if(c == index-1) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
            c++;
        }
        
        return head;
    }
}
