/*
Given 2 non-negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. 
Both A and B fit in a 32 bit signed integer.

*/
public class Solution {
    public int gcd(int A, int B) {
        if(A==0 || B==0){
            return A+B;
        }
         
        return gcd(B%A , A);
    }
}
