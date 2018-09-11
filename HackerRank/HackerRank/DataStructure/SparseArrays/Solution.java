package HackerRank.DataStructure.SparseArrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();
        scan.nextLine();

     //   String[] originalStr= new String[n];
        ArrayList<String> originalStr= new ArrayList<>();

        for(int i=0;i<n;i++){
            String str= scan.nextLine();
            originalStr.add(str);
        }

        int m= scan.nextInt();
        scan.nextLine();

        String[] localStr= new String[n];
        for(int i=0;i<n;i++){
            localStr[i]= scan.nextLine();
        }

       for(int i=0;i<m;i++){
            int count=0;
            for(String str: originalStr){
                if(localStr[i].equals(str)){
                    count++;
                }
            }
            System.out.println(count);
       }


    }
}
