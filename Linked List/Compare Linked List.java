/*

Given heads of two linked lists A and B, check if they are identical 
i.e. each of their corresponding nodes should contain the same data. 
The two given linked lists may or may not be of the same length.
*/

public class Solution {
    public int solve(ListNode A, ListNode B) {

        while(A !=null && B !=null){
            if(A.val != B.val){
                return 0;
            }
            A = A.next;
            B = B.next;

        }
        return 1;
    }
}
