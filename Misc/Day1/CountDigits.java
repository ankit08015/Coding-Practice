package Day1;

import java.util.Scanner;

public class CountDigits {

    public static void main(String args[]){

        Scanner s= new Scanner(System.in);

        String str= s.nextLine();

        char[] chArr= str.toCharArray();

        int[] num= new int[10];


        for(char c: chArr){
            if(c>=48&&c<=57){
                int i=Character.getNumericValue(c);
                num[i]++;
            }
        }
        for(int i=0;i<num.length;i++) {
            System.out.println(i+" "+ num[i]);
        }
    }
}
