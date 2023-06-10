/*You are given a string A of lowercase English alphabets. Rearrange the characters of the given string 
 A such that there is no boring substring in A.
A boring substring has the following properties:Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.
(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.

*/



public class Solution {
    public int solve(String A) {

        int N = A.length();

        HashSet<Integer>odd = new HashSet<Integer>();
        HashSet<Integer>even = new HashSet<Integer>();

        for(int i=0 ; i<N ; i++){
            int X = A.charAt(i);
            if(X % 2 ==0){
                even.add(X);
            }
            else{
                odd.add(X);
            }
        }

        for(Integer i : odd){
            for(Integer j : even){
                if(Math.abs(i - j) != 1){
                    return 1;
                }
            }
        }

        return 0;

    }
}