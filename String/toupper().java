/*
You are given a function to_upper() consisting of a character array A.

Convert each charater of A into Uppercase character if it exists. 
If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array. */

public class Solution {
    public char[] to_upper(char[] A) {
        int N = A.length;
        for(int i=0 ; i<N ; i++){
            if(A[i] >= 'a' &&  A[i] <='z'){
                A[i] = (char) (A[i] -32);
            }
        }
        return A;
    }
}
