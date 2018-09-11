package Regex.FindSubstring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        sc.nextLine();

        String [] target= new String[n];

        for(int i=0;i<n;i++){
            target[i]= sc.nextLine();
        }

        int q= sc.nextInt();
        sc.nextLine();

        String queries[]= new String [q];

        for(int i=0;i<q;i++){
            queries[i]= sc.nextLine();
        }
//
//        String finalTarget="";
//
//        for(String s:target)finalTarget=finalTarget+s;

        for(int i=0;i<q;i++){

            String str=queries[i];
            Pattern p= Pattern.compile("[\\w]"+str+"[\\w]");


            int count=0;

            for(int j=0;j<n;j++) {

                Matcher m = p.matcher(target[j]);

                while (m.find()) {
                    count++;
                    System.out.println(m.group());
                }
            }
            System.out.println(count);

        }
    }
}
