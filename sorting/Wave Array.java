/*

Given an array of integers A, sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that

a1 >= a2 <= a3 >= a4 <= a5..... 
NOTE: If multiple answers are possible, return the lexicographically smallest one.
*/

public class Solution {
    public int[] wave(int[] A) {
        int N = A.length;
        Arrays.sort(A);

        for(int i=0 ; i<N-1 ; i = i+2){
            int temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;

        }

        return A;
    }
}
