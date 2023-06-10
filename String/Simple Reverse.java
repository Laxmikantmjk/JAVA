/*Given a string A, you are asked to reverse the string and return the reversed string.

*/
public class Solution {
    public String solve(String A) {
        int N = A.length();
        StringBuilder S = new StringBuilder();
        for(int i= N-1 ; i>=0 ; i--){
            char X =  A.charAt(i);
            S.append(X);
        }
        return S.toString() ;
    }
}
