/*
You are given a function to_lower() which takes a character array A as an argument.

Convert each character of A into lowercase characters if it exists. 
If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.*/

public class Solution {
    public char[] to_lower(char[] A) {
        int N= A.length;
        for (int i=0 ; i<N ; i++){
            if(A[i] >= 'A' && A[i] <='Z'){
                A[i] =(char)(A[i] + 32) ;
            }
        }
        
        return A ;
    }
    }
