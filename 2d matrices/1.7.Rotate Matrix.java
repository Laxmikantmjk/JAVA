/*

You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.

*/

public class Solution {
    public void solve(int[][] A) {

        int N = A.length;

        //take transpose of matrix
        for(int i=0 ; i<N ; i++){
            for(int j=i+1 ; j<N ; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //reverse the rows

        for(int i=0 ; i<N ; i++){
            int S1 = 0;
            int S2 = N-1;

            while(S1<S2){
                int temp = A[i][S1];
                A[i][S1] = A[i][S2];
                A[i][S2] = temp;
                S1++;
                S2--;
            }
        }

        //return A;
    }
}
