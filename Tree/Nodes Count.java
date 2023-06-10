/* You are given the root node of a binary tree A. You have to find the number of nodes in this tree.*/

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
    public int solve(TreeNode A) {
        if(A==null){
            return 0;
        }
        int L = solve(A.left);
        int R = solve(A.right);
        return L + R + 1;
    }
}
