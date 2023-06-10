/*Given an Integer A. Return 1 if A is prime and return 0 if not.*/

public class Solution {
    public int solve(long A) {
        //int count=0;
        if (A==1){
            return 0 ;
        }
        for(long i=2 ; i*i<=A ; i++){
            if(A%i ==0){
                return 0;
               /* if(A/i == i){
                    return ;
                }
                else{
                    count = count +2;
                }
                */
            }
            
        }
        return 1 ;
       /* if(count == 0){
            return 1;
        }
        else{
            return 0;
        }
        */
    }