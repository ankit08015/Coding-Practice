package Day6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);

        int testCase= in.nextInt();



        String [] str= new String[testCase];
        in.nextLine();

        for(int j=0;j<testCase;j++){

            str[j]= in.nextLine();


        }

        for(int j=0;j<testCase;j++){
            char[] charArray= str[j].toCharArray();
            for(int i=0;i<charArray.length;i=i+2){
                System.out.print(charArray[i]);
            }

            System.out.print(" ");

            for(int i=1;i<charArray.length;i=i+2){
                System.out.print(charArray[i]);
            }
            System.out.println("");
        }


        in.close();
    }
}
