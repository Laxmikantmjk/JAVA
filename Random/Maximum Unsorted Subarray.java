/*Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that 
 * if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.
*/

public class Solution {
    public int[] subUnsort(int[] A) {
        int N = A.length;

        int []B = new int[A.length];
        for(int i=0 ; i<N ; i++){
            B[i] = A[i];
        }

        Arrays.sort(B);
        int left =-1;
        int right =-1;

        

        for(int i=0 ; i<N ; i++){
            if(A[i] != B[i]){
                left = i;
                break;
            }
        }
        for(int i=N-1 ; i>0 ; i--){
            if(A[i] != B[i]){
                right = i;
                break;
            }
        }

        if(left == -1){
            int ans[] = {-1};
            return ans;
        }
        int ans[] = {left , right};

        return ans;

        
    }
}

