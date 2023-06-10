/*Given two sorted arrays of distinct integers, A and B, and an integer C, 
 * find and return the pair whose sum is closest to C and the pair has one element from each array.
More formally, find A[i] and B[j] such that abs((A[i] + B[j]) - C) has minimum value.
If there are multiple solutions find the one with minimum i and even if there are multiple values 
of j for the same i then return the one with minimum j.

Return an array with two elements {A[i], B[j]} */

public class Solution {

public int[] solve(int[] A, int[] B, int C) {

    int N = A.length;
    int M = B.length;
    int diff = Integer.MAX_VALUE;
    int X =-1;
    int Y = -1;
    int S1 = 0;
    int S2 = M-1;

    while(S1<N && S2 >=0){
        int sum = A[S1] + B[S2];
        if(sum == C){
            if(diff == Math.abs(sum - C) && X == S1) {
                X=S1;
                Y=S2;   
            }
            else if(diff > Math.abs(sum - C)) {
                X=S1;
                Y=S2;
            }
            diff = 0;
            S2--;
        } else if(sum <C){
            if(Math.abs(C-sum) < diff){
                diff = Math.abs(C-sum);
                X = S1;
                Y = S2;
            } else if(Math.abs(C-sum) == diff && X == S1) {
                Y = S2;
            }
            S1++;
        } else{
            if(Math.abs(C-sum) < diff){
                diff = Math.abs(C-sum);
                X = S1;
                Y = S2;
            } else if(Math.abs(C-sum) == diff && X == S1) {
                Y = S2;
            }
            S2--;
        }
    }

    int ans[] = {A[X] , B[Y]};
    return ans;

    }
}