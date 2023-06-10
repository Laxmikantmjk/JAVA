/*Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.*/

public class Solution {
    public int solve(int B, int[] A) {
        int N = A.length;

       HashSet<Integer>set = new HashSet<Integer>();


        for(int i=0 ; i<N ; i++){
            if(set.contains(B - A[i])){
                return 1 ;
            }
            set.add(A[i]);
        }
        return 0 ;
    }
}
