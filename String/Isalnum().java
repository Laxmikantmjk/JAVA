/*
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.*/

public class Solution {
    public int solve(char[] A) {
        int N = A.length;
        for(int i=0 ; i<N ; i++){
            boolean Z = (A[i] >= 'A' && A[i] <= 'Z') || (A[i] >= 'a' && A[i] <= 'z' ) || (A[i] >= '0' && A[i] <= '9');
            if(Z == false){
                return 0 ;
            }
        }
        return 1 ;
    }
}
