/*
Reverse a linked list A from position B to C.

NOTE: Do it in-place and in one-pass.
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
    public ListNode reverseBetween(ListNode A, int B, int C) {

        ListNode first = null;
        ListNode last = null;
        ListNode from = null;
        ListNode to = null;

        int count=0;
        ListNode curr =A;

        while(curr !=null){
            count++;
            if(count<B){
                first = curr ;
            }
            if(count ==B){
                from = curr;
            }
            if(count ==C){
                to = curr;
                last = to.next ;
                break;
            }
            curr = curr.next ;
        }

        curr = from;
        ListNode prev = last;
        ListNode temp = null;

        while(curr !=last){
            temp = curr.next ;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        if(first==null){
            A= to;
        }
        else {
            first.next =to;
        }


        return A;
    }
}
