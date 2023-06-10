/*Write a program to return a string from a given string s where all occurrences of 
the first char of the string except the first occurrence have been changed to '$'.*/

public static String change_char(String s) {

    int N = s.length();
    char X = s.charAt(0);
    String ans = "" ;
    ans = ans + X ;
    for(int i=1 ; i<N ; i++){
        if(s.charAt(i) == X){
            ans = ans + '$';

        }
        else{
            ans = ans + s.charAt(i);
        }

    }

    return ans;
}