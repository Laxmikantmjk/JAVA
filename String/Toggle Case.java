/*You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.*/

public class Solution {
    public String solve(String A) {
        int N = A.length();
        StringBuilder ans = new StringBuilder() ;
        for(int i=0 ; i<N ; i++){
            if(A.charAt(i) >= 'A' && A.charAt(i) <= 'Z'){
               char X = (char)(A.charAt(i) + 32);
               ans.append(X) ;
                
            }
            else{
                 char X  = (char)(A.charAt(i) - 32);
                  ans.append(X) ;
                
            }
        }
        return ans.toString() ;
    }
}
