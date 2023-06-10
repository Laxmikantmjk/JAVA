/*Given a binary tree, return the inorder traversal of its nodes' values.*/

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
 //recursion
public class Solution {
    ArrayList<Integer>List = new ArrayList<Integer>();

    public void solve(TreeNode A){
        if(A==null){
            return ;
        }
        solve(A.left);
        List.add(A.val);
        solve(A.right);

    }
    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        solve(A);

        return List;
    }
}