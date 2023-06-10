/*
Given the root of a tree A with each node having a certain value, find the count of nodes with more value than all its ancestor.


*/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {

    int Max = Integer.MIN_VALUE;
    int count =0;

    public void C(TreeNode A , int Max){
        
        if(A==null){
            return ;
        }
        if(A.val > Max){
            Max = A.val;
            count++;
        } 

        C(A.left , Max);
        C(A.right, Max);
    }
    public int solve(TreeNode A) {

        Max = Integer.MIN_VALUE;

        count = 0;

        C(A , Max);

        return count;

       
    }
}
