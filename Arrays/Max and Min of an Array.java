/*
Take input an array A of size N and write a program to print maximum and minimum elements of the input. 
The only line of the input would contain a single integer N that represents the length of the array followed by 
the N elements of the input array A. */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int high =0;
        int low = arr[1];
         for(int i=0 ; i<n ; i++){
            high = Math.max(high , arr[i]);
            low = Math.min(low, arr[i]);
        }
        System.out.println(high + " " + low);
        
    }
}
