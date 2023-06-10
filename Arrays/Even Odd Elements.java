/*
You are given T(number of test cases) integer arrays. 
For each array A, you have to find the value of absolute 
difference between the counts of even and odd elements in the array.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0 ; i<T ; i++){
            int n = sc.nextInt();
            int[]arr = new int[n];
            for(int k=0 ; k<n ; k++){
                arr[k] = sc.nextInt();
            }
            int counte =0;
            int counto =0;
            for(int j=0 ; j<n ; j++){
                if(arr[j] % 2 ==0){
                    counte++;
                }
                else{
                    counto++;
                }
            }
            System.out.println(Math.abs(counte - counto));
        }
        
    }
}

