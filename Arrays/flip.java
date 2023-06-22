/*
ou are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, 
you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, 
we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
*/
public class Solution {
    public int[] flip(String A) {

        int N = A.length();
        int L =0;
        int R =0;
        int count=0;
        int max =0;
        int ans[] = new int[2];

        for(int i=0 ; i<N ; i++){
            if(A.charAt(i)=='0'){
                count++;
            }
            else{
                count--;
            }

            if(count>max){
                max = count;
                ans[0] = L+1;
                ans[1] = R +1;
            }
            if(count<0){
                count =0;
                L=i+1;
                R=i+1;
            }
            else{
                R++;
            }
        }

        if(max==0){
            return new int[0];
        }

        return ans;
    }
}
