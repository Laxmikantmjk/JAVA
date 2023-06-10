/*
You are given the head of a linked list A and an integer B, check if there is any node which contains this value B.

Return 1 if such a node is present else return 0.
*/

public class Solution {
    public int solve(ListNode A, int B) {
        ListNode temp  =A;
        while(temp != null){
            if(temp.val == B){
                return 1;
            }
            temp = temp.next ;
        }
        return 0 ;
    }
}
