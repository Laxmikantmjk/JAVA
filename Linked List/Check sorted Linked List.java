/*

You are given the head of a linked list A. Check if the data inside it exists in non-decreasing order.

*/

public class Solution {
    public int solve(ListNode A) {
        ListNode temp =A ;
        while(temp.next !=null){
            if(temp.val > temp.next.val){
                return 0;
            }
            temp = temp.next;
        }
        return 1 ;
    }
}
