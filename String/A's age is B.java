/*Given the name A and age B of a person in input. Print A's age is B in the output.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int A = sc.nextInt();

        System.out.print(S +"'s age is " + A);
        
    }
}