/*Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".*/

public class Solution {
    public String longestCommonPrefix(String[] A) {
        int N = A.length;

        if(N==0){
            return "";
        }

        if(N==1){
            return A[0];
        }
        int L = Integer.MAX_VALUE ; 
        for(int i=0 ; i<N ; i++){
            L = Math.min(L , A[i].length());
        }
        String ans = "";
        for(int i= 0 ; i<L ; i++){
            char c = A[0].charAt(i);
            for (int j=1 ; j<N ; j++){
                if(A[j].charAt(i) != c){
                    return ans ;
                }
            }
            ans = ans + c;
        }
        return ans ;

    }
}public class Solution {
    public String longestCommonPrefix(String[] A) {
        int N = A.length;

        if(N==0){
            return "";
        }

        if(N==1){
            return A[0];
        }
        int L = Integer.MAX_VALUE ; 
        for(int i=0 ; i<N ; i++){
            L = Math.min(L , A[i].length());
        }
        String ans = "";
        for(int i= 0 ; i<L ; i++){
            char c = A[0].charAt(i);
            for (int j=1 ; j<N ; j++){
                if(A[j].charAt(i) != c){
                    return ans ;
                }
            }
            ans = ans + c;
        }
        return ans ;

    }
}