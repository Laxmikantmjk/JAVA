/* Palindrome or not 
 * Write a program to check whether the given string is a palindrome or not. Return True if it is palindrome else return False.

Note: A string is said to be a palindrome if the reverse of the string is the same as the string itself.*/

public static boolean isPalin(String s) {
    // complete the function template
        String reverse = "";
        for(int i =0; i <s.length(); i++){
            reverse = s.charAt(i)+ reverse;
        }
        if(reverse.equals(s)){
            return true;
        }
        return false;
}