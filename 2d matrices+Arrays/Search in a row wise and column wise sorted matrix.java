/*
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing
*/


public class Solution {
    public int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;

        int i = N-1 ;
        int j = 0;
        int ans = Integer.MAX_VALUE ;
        int K =ans ;
        while(i>=0 && j<M){
            if(A[i][j]==B){
                ans = Math.min( ((i+1)*1009 + (j+1)) , ans);
                i--;
                continue;
            }
            if(A[i][j]>B){
                i--;
            }
            else if(A[i][j]<B){
                j++;
            }  
        }
        
        if(ans !=K){
                return ans;
            } 

        return -1;
    }
}
