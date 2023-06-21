/*Given a sorted linked list, delete all duplicates such that each element appears only once.*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;
        if((A==null) || (A.next ==null)){
            return A;
        }

        while(temp != null){
            
                while(temp.next != null && temp.val == temp.next.val){
                    temp.next = temp.next.next ;
                }
            
            temp = temp.next ;
        }

        return A;
    }
}
