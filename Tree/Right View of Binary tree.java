/*

Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.

Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
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
    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer>L1 = new ArrayList<>();

        L1.add(A.val);

        Queue<TreeNode> Q = new LinkedList<>();

        Stack <TreeNode>St = new Stack<TreeNode>();

        if(A==null){
            return null;
        }

        Q.add(A);
        Q.add(null);
        int temp =0;
        TreeNode X = null ;

        while(true){
            St.push(X);
            X = Q.remove();
            if(X == null){
                
                if(Q.isEmpty()){
                    break;
                }
                else{
                    //Q.remove();
                    Q.add(null);
                    TreeNode K = Q.peek();
                    L1.add(K.val);
                    continue;

                }
            }

            

            if(X.right != null){
                Q.add(X.right);
            }

            if(X.left != null){
                Q.add(X.left);
            }

        }

        return L1;
    }
}
