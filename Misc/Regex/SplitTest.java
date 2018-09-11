package Regex;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SplitTest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String s1= sc.nextLine();
            Pattern p= Pattern.compile("-|\\s");

            String[] s= p.split(s1);
           // for(String str:s)System.out.println(str);

            System.out.println("CountryCode="+s[0]+",LocalAreaCode="+s[1]+",Number="+s[2]);

        }
    }
}
