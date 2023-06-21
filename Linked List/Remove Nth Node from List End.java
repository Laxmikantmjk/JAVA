/*
Given a linked list A, remove the B-th node from the end of the list and return its head. 
For example, Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, 
the linked list becomes 1->2->3->5. NOTE: If B is greater than the size of the list, remove the first node of the list.
 NOTE: Try doing it using constant additional space.
 
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
    //to reverse the list
    public ListNode reverse(ListNode A){
        if(A.next == null){
            return A;
        }
        ListNode current = A;
        ListNode prev = null;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = prev ;
            prev = current;
            current = next ;
        }
        return prev;
    }
    //to count length of list
    public int Length(ListNode A){
        ListNode temp = A;
        int length =0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;

    }

    //to delete the kth element
    public ListNode delete(ListNode A , int B){
        int L = Length(A);
        if(B==1){
            A = A.next;
            return A;
        }
        if(B>L){
            B=L;
        }
        ListNode temp = A;
        for(int i=1 ; i<B-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return A;
    }

    public ListNode removeNthFromEnd(ListNode A, int B) {
        int L = Length(A);
        if (L==1){
            A=null;
            return A;
        }
        ListNode temp = A;
        temp = reverse(temp);
        temp = delete(temp , B);
        temp = reverse(temp);
        return temp ;
    }
}


