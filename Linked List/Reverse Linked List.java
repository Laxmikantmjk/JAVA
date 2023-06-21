/*You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.

NOTE: You have to do it in-place and in one-pass.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode current = A;
        ListNode prev = null;
        ListNode next ;
        if(current.next == null){
            return A;
        }

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next ;
        }

        return prev ;
    }
}
