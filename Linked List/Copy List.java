/*
You are given a linked list A
Each node in the linked list contains two pointers: a next pointer and a random pointer
The next pointer points to the next node in the list
The random pointer can point to any node in the list, or it can be NULL
Your task is to create a deep copy of the linked list A
The copied list should be a completely separate linked list from the original list, but with the same node values and random pointer connections as the original list
You should create a new linked list B, where each node in B has the same value as the corresponding node in A
The next and random pointers of each node in B should point to the corresponding nodes in B (rather than A)
*/

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {

        //create dummy node after each node in original list;
        RandomListNode temp = head;
        while(temp !=null){
            
           RandomListNode Y = new RandomListNode(temp.label);
           Y.next = temp.next ;
           temp.next = Y;
           temp = temp.next.next ;
        }

        //link  dummy node to random pointers
        RandomListNode temp1 = head;
        while(temp1 != null){
            if(temp1.random !=null){
                temp1.next.random = temp1.random.next ;
            }
            temp1 = temp1.next.next;
        }

        //seperate new link
        RandomListNode H = head.next;
        RandomListNode temp2 = head ;
        RandomListNode temp3 = head.next;
        while(temp2 != null){
            temp2.next = temp2.next.next ;
            if(temp3.next != null){
                temp3.next = temp3.next.next ;
            }
            temp2 = temp2.next;
            temp3 = temp3.next;

        }

        return H;


    }
}
