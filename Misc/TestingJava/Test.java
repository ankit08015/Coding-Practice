package TestingJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);

        int len= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<len;i++){
            int x= sc.nextInt();
            list.add(x);
        }

        int q= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q;i++){
            String query= sc.nextLine();

            if(query.equalsIgnoreCase("Insert")){
                int place= sc.nextInt();
                int value= sc.nextInt();
                sc.nextLine();

                if(place>=len)list.add(value);
                else list.add(place,value);
            }
            if(query.equalsIgnoreCase("Delete")){
                int value= sc.nextInt();
                sc.nextLine();
                list.remove(value);
            }
        }

        for(int i:list)System.out.print(i+" ");
    }
}

