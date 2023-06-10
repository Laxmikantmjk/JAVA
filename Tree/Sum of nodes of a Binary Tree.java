/*
Given the root of a binary tree A. Return the sum of all the nodes of the binary tree.

*/


public class Solution {
    public int solve(TreeNode A) {

        if(A==null){
            return 0;
        }

        return A.val + solve(A.right) + solve(A.left);

    }
}
