/*
Write a program to print sum of elements of the input array A of size N.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0 ; i<n ;i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);    
    }
}