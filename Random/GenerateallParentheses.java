public class Solution {
    ArrayList < String > ans;
    // cnt denotes remaining open brackets (
    // dif denotes the difference between open and closed brackets
    void solve(int cnt, int dif, int n, String s) {
        if (n == 0) {
            ans.add(s);
            return;
        }
        // Now we have 2 options. We can either add '(' to the string or add ')' to the string. 
        // Option 1. Add '(' 
        if (cnt > 0)
            solve(cnt - 1, dif + 1, n - 1, s + '(');
        // Option 2. Add ')'
        if (dif > 0)
            solve(cnt, dif - 1, n - 1, s + ')');
    }
    public ArrayList < String > generateParenthesis(int A) {
        ans = new ArrayList < > ();
        solve(A, 0, 2 * A, "");
        return ans;
    }
}