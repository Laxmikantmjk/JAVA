/*You are given A which is the head of a linked list. Print the linked list in space separated manner.

Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line */

public class Solution {
    public void solve(ListNode A) {
        
        while(A != null){
            System.out.print(A.val + " ") ;
            A= A.next ;
        }
        System.out.println();

        
    }
}
