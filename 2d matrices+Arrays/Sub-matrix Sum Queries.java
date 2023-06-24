/*
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
The sum may be large, so return the answer mod 109 + 7.
Also, select the data type carefully, if you want to store the addition of some elements.
Indexing given in B, C, D, and E arrays is 1-based.
Top Left 0-based index = (B[i] - 1, C[i] - 1)
Bottom Right 0-based index = (D[i] - 1, E[i] - 1)
*/


public class Solution {

     long mod = 1000000007;
     public int subsum (long[][]A ,int Rs , int Cs , int Re , int Ce){
        long sum = A[Re][Ce];
        //sum = (sum + mod) % mod;
        if(Cs>0){
            sum = sum -A[Re][Cs-1];
            sum = (sum + mod) % mod;
        }

        if(Rs>0){
            sum = sum - A[Rs-1][Ce];
            sum = (sum + mod) % mod;
        }

        if(Rs>0 && Cs>0){
            sum = sum + A[Rs-1][Cs-1];
            sum = (sum + mod) % mod;

        }
        return ((int)sum);

    }

    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        int An = A.length;
        int Am = A[0].length;
        int BL = B.length;
        int CL = C.length;
        int DL = D.length;
        int EL = E.length;

        //find prefix sum array

        long presum[][] = new long[An][Am];
        for(int i=0 ; i < An; i++){
            for(int j = 0; j < Am; j++){
                if(j == 0){
                    presum[i][j] = A[i][j];
                    }
                else{
                    presum[i][j] = presum[i][j - 1] + A[i][j];

                }
                presum[i][j] =  (presum[i][j] + mod) %mod;

            }

        }

        for(int j =0 ; j < Am; j++){
            for(int i = 1; i < An; i++){
                presum[i][j] += presum[i-1][j];
                presum[i][j] =  (presum[i][j] + mod) %mod;
                }
        }

    //run for Q querry

    int []Ans = new int[BL];

    for(int Rs=0 ; Rs<BL ; Rs++){
        Ans[Rs]= subsum( presum ,B[Rs]-1 , C[Rs]-1 , D[Rs]-1 , E[Rs]-1);

 }
return Ans;       
}

}