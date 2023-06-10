
public class Solution {
    
    

    public int solve(TreeNode A , int min , int max){
        if(A==null){
            return 1;
        }
         if(A.val<min || A.val>max){
             return 0;
         }

         return solve(A.left ,min , A.val-1) * solve(A.right , A.val+1, max);
    }
    public int isValidBST(TreeNode A) {
        int X = Integer.MIN_VALUE ;
        int Y = Integer.MAX_VALUE ;

        return solve(A,X,Y);
    }
}