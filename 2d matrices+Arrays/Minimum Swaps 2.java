/*
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)].

It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.
*/

public class Solution {
    public int solve(int[] A) {

        int N = A.length ;
        int count =0 ; 
        int i=0;
        while(i<N){
            if(A[i] != i){
                count++;
                int temp = A[A[i]];
                A[A[i]] = A[i];
                A[i] = temp;
            }
            else{
                i++;
            }
        }

        return count ;
    }
}
