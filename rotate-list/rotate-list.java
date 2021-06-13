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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        int count = 0;
        ListNode temp = head;
        ListNode prev = null;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        count++;
        temp.next = head;
        int point = count - k%count + 1;
        ListNode start = head;
        while(point != 1){
            prev = start;
            start = start.next;
            point--;
        }
        prev.next = null;
        head = start;
        return head;
    }
}