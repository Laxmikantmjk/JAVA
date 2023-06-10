public class Solution {
    public int solve(TreeNode A, int B) {

        TreeNode temp  = A;

        while(temp != null){
            if(temp.val > B){
                temp = temp.left;
            }
            else if(temp.val < B){
                temp = temp.right;
            }
            else if(temp.val ==B){
                return 1;
            }
        }

        return 0 ;
    }
}
