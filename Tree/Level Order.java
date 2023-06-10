/*Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

*/
 */
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
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {

        ArrayList <ArrayList<Integer>> L = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer>L1 = new ArrayList<>();

        L1.add(A.val);

        L.add(L1);

        L1 = new ArrayList<>();

        Queue<TreeNode> Q = new LinkedList<>();

        if(A==null){
            return null;
        }

        Q.add(A);
        Q.add(null);

        while(true){
            TreeNode X = Q.remove();
            if(X == null){
                if(Q.isEmpty()){
                    break;
                }
                else{
                    //Q.remove();
                    Q.add(null);
                    L.add(Q.peek());
                    L1 = new ArrayList<>();
                    continue;

                }
            }

            

            if(X.left != null){
                Q.add(X.left);
                L1.add(X.left.val);
            }

            if(X.right != null){
                Q.add(X.right);
                L1.add(X.right.val);
            }

        }

        return L;
    }
}