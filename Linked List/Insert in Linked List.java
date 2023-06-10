/*

You are given A which is the head of a linked list. Also given is the value B and position C. Complete the function that should insert a new node with the said value at the given position.

Notes:

In case the position is more than length of linked list, simply insert the new node at the tail only.
In case the pos is 0 or less, simply insert the new node at head only.
Follow 0-based indexing for the node numbering.

*/

public class Solution {
    public ListNode solve(ListNode A, int B, int C) {
        
        
        int Count = 0;
        ListNode temp = A;
        while(temp !=null){
            temp = temp.next ;
            Count++ ;
        }

        ListNode NN = new ListNode(B);
        if(C==0){
            NN.next = A ;
            A = NN ;
            return A ;
        }

         if(C>=Count){
             ListNode temp3 = A;
             while(temp3.next != null){
                 temp3 = temp3.next ;
             }
             temp3.next = NN;
            return A;
        }

        ListNode temp1 = A;
       for(int i=0 ; i<C-1 ; i++){
                temp1 = temp1.next ;
        }
        NN.next = temp1.next ;
        temp1.next = NN ;
        return A ;

    }
}