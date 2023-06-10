/*
Given a binary tree, find and return the sum of node value of all left leaves in it.
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

    public boolean isleaf(TreeNode A ){
        if(A== null){
            return false;
        }
        if(A.right == null & A.left == null){
            return true;
        }

        return false;
    }


    int ans =0;
    public void solvefun(TreeNode A ){
        if(A==null){
            return ;
        }
        if(isleaf(A.left)){
            ans = ans + A.left.val ;

        }
        /*if(A.right ==null){
            return ;
        }*/
        solvefun(A.right);
        solvefun(A.left);
    }


    public int solve(TreeNode A) {

        ans=0;

        solvefun(A);

        return ans;
        
    }
}
