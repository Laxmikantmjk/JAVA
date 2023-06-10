/* you are given two integers A and B.

You have to find the value of AB.*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int power(final int A, final int B) {
        int power = 1;
        for(int i=0 ; i<B ; i++){
            power = power * A ;
        }
        return power ;
    }
}
