/*

You are given the head of a linked list A and an integer B. You need to find the B-th element of the linked list.

Note : Follow 0-based indexing for the node numbering.

*/

public class Solution {
    public int solve(ListNode A, int B) {
        ListNode temp = A;
        int ind =0;
        while(ind <B){
            temp = temp.next;
            ind++;
        }
        return temp.val;
    }
}
