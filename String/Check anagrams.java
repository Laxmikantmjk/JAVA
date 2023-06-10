/*You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.*/

public class Solution {
    public int solve(String A, String B) {
        int N = A.length();
        int M = B.length();
        char [] a = A.toCharArray();
        char [] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if(N != M){
            return 0;
        }
        int count =0;

        for(int i=0 ;i<N ; i++){
            if(a[i] == b[i]){
                count++;
            }
        }
        if(count == N){
            return 1 ;
        }
        return 0 ;
    }
}
