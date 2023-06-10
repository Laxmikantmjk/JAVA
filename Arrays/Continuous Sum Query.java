/*
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. 
When the devotees come to the temple, they donate some amount of coins to these beggars. 
Each devotee gives a fixed amount of coin(according to their faith and ability) 
to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, 
find out the final amount of money in each beggar's pot at the end of the day,
provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B.
*/

public class Solution {
    public int[] solve(int A, int[][] B) {

        int L = B.length ;


        int ans[] = new int[A];

        for(int i= 0 ;i<L ; i++){
            for(int j = B[i][0]-1 ; j<B[i][1] ; j++){
                ans[j] = ans[j] + B[i][2];
            }
        }
        return ans ;
    }

}