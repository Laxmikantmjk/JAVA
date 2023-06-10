/*
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. 
Specifically, make entire ith row and jth column zero.

*/

public class Solution {
    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int ans[][] = new int[N][M];
        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                ans[i][j] = -1;
            }
        }

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                if(A[i][j] ==0){

                    for(int R=0 ; R<N; R++){
                        ans[R][j] = 0;
                    }

                     for(int C=0 ; C<M; C++){
                        ans[i][C] = 0;
                    }

                }
            }
        }

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                if(ans[i][j] != 0){
                    ans[i][j] = A[i][j];
                }
            }
        }

        return ans;
    }
}
