/*

You are given the head of a linked list A and an integer B. Delete the B-th node from the linked list.

Note : Follow 0-based indexing for the node numbering.abstract
*/

public class Solution {
    public ListNode solve(ListNode A, int B) {
        int count =0;
        ListNode temp =A ;

        if(B==0){
            temp = temp.next;
            A =temp;
            return A;
        }
        
        while(count<B-1){
            count++;
            temp = temp.next ;
        }

        temp.next = temp.next.next;

        return A;   
    }
}
