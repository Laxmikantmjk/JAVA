public class Solution {
    /*
     * Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.


     */
	
	
	public int solve(int[][] A) {
        int N = A.length;
        
        int ans = 0;


    for(int i=0 ; i<N ; i++){
        for(int j=0 ; j<N ; j++){
            int sum = A[i][j] * (i+1) * (j+1) * (N-i) * (N-j) ;
            ans = ans + sum ;
        }    
    }

    return ans ;
    }
}
