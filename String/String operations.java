/*
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.*/

public class Solution {
    public String solve(String A) {
        String C = A+A ;
        int N = C.length();
        
        StringBuilder X = new StringBuilder() ;
        for(int i=0 ; i<N ; i++){
            if(C.charAt(i) =='a' || C.charAt(i) =='e' || C.charAt(i) =='i' || C.charAt(i) =='o' || C.charAt(i) =='u'){
                X = X.append('#');
            }
            else if(C.charAt(i) >= 'A' && C.charAt(i) <='Z'){
               continue ;
            }
            else {
                X = X.append(C.charAt(i));
            }
        }
        String ans = X.toString();
        return ans ; 
    }
}
