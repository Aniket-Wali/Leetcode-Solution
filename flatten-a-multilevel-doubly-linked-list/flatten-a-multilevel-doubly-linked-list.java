/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node child = curr.child;
                while (child.next != null) {
                    child = child.next;
                }
                child.next = curr.next;
                if (curr.next != null) {
                    curr.next.prev = child;
                }
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }
}