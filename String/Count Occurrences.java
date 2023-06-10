/*
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
*/

public class Solution {
    public int solve(String A) {
        int N = A.length() ;
        int count =0 ;
        for(int i=0 ; i<N-2 ; i++){
            if(A.charAt(i) =='b' && A.charAt(i+1) =='o' && A.charAt(i+2) =='b' ){
                count++ ;
            }
        }
        return count ;
    }
}
