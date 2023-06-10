/*Write a program to print all negative numbers from input array A of size N. 
Take integer N and N elements of the array as input from user.*

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
         for(int i=0 ; i<n ; i++){
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}