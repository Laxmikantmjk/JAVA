/*You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string. */

public class Solution {
    public String solve(String A) {

        int N = A.length();

        StringBuilder S = new StringBuilder();

        for(int i=N-1 ; i>=0 ; i--){
            char X = A.charAt(i);
            S.append(X);
        }

        String Z = S.toString();
        char []B = Z.toCharArray();
        int P1=0;
        int P2=0;

        while(B[P2] == ' '){
            P1++;
            P2++;
        }

        while(P2<N){
            while(P2<N && B[P2] != ' '){
                P2++;
            }
            int x = P2;
            while(P1<P2){
                char C = B[P1];
                B[P1] = B[P2-1];
                B[P2-1] = C;
                P1++;
                P2--;
            }
            P1 = x+1;
            P2 = P1;
        } 

        String ans = new String(B);
        return ans.substring(1,ans.length()) ;
    }
}