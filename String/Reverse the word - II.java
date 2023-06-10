/*ou are given lowercase string (A) and you have to return after reversing that.*/

public class Solution {
    public String solve(String A) {

        int N = A.length();

        String ans = "";  

        for(int i=N-1 ; i>=0 ; i--){
            ans = ans + A.charAt(i);
        }

        return ans;

    }
}
