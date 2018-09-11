package HackerRank.DataStructure.String;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());
        String str;

      //  str= A.compareTo(B)==1?"Yes":"No";

        System.out.println(A.compareTo(B));

        char[] a= A.toCharArray();
        char[] b= B.toCharArray();

        a[0]= Character.toUpperCase(a[0]);
        b[0]= Character.toUpperCase(b[0]);

        A= String.valueOf(a);
        B= String.valueOf(b);
        System.out.println(A+" "+B);



    }
}

