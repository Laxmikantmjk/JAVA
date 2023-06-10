/*
Write a program to find the difference between the sum of all
 even elements and the sum of all odd elements from the given list.*/

public static int even_odd(int[] ls) {
            int sumeve = 0;
            int sumodd = 0;
        for (int k =0 ; k< ls.length ; k++){
            if(ls[k] % 2 ==0){
                sumeve = sumeve + ls[k];
            }
            else{
                sumodd = sumodd + ls[k];
            }
        }
        return (Math.abs(sumeve - sumodd));

        }

