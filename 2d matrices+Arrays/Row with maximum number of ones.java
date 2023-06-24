/*

Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).
*/

public class Solution {
    public int solve(int[][] A) {
        int N = A.length;
        int i = 0; //Starting from first row
        int j= N-1 ; //Starting from last column
        int count = 1;
        int ans = 0 ; //for storing the index number

         while (i< N && j >= 0) {
             if ( A[i][j] == 0) {
                 i++ ;}

                 else if (A[i][j]== 1) {
                     j-- ; count++ ; ans = i; }
                     
                 
            } 
            
            return ans ;

    }
}

