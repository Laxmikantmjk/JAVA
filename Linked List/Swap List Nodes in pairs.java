/*

Given a linked list A, swap every two adjacent nodes and return its head.

NOTE: Your algorithm should use only constant space. You may not modify the values in the list; only nodes themselves can be changed.

*/

public class Solution {
    public ListNode swapPairs(ListNode A) {
        // Initialize a dummy node as the head of the linked list.
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        
        // Set the current node to the dummy node.
        ListNode curr = dummy;
        
        // While the current node has at least two more nodes after it, swap the next two nodes.
        while (curr.next != null && curr.next.next != null) {
            // Store the next two nodes in variables node1 and node2.
            ListNode node1 = curr.next;
            ListNode node2 = curr.next.next;
            
            // Swap the next two nodes.
            curr.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            
            // Set the current node to node1.
            curr = node1;
        }
        
        // Return the dummy node's next pointer as the new head of the linked list.
        return dummy.next;
    }
}