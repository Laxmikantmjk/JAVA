/*
Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).

Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    public TreeNode formBBST(int A[] , int Start , int end){

        if(Start>end){
            return null;
        }
        int mid = (Start+end)/2 ;
        TreeNode X = new TreeNode(A[mid]);
        X.left = formBBST(A , Start , mid-1);
        X.right = formBBST(A , mid+1 , end);

        return X;
    }
    public TreeNode sortedArrayToBST(final int[] A) {
        int N = A.length;

        int Start =0;

        return formBBST(A , Start , N-1);
    }
}