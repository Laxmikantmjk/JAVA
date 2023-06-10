/*Given a binary tree, return the preorder traversal of its nodes values. */

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
    ArrayList <Integer>List = new ArrayList<Integer>();

    public void solve(TreeNode A){
        if(A==null){
            return ;
        }
        List.add(A.val);
        solve(A.left);
        solve(A.right);
    }
    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        solve(A);

        return List;
    }
}
