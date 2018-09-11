package HackerRank.DataStructure.ArrayList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);

        ArrayList<Integer[]> arr= new ArrayList<>();

        int n= sc.nextInt();

        for(int i= 0;i<n;i++){
            int l= sc.nextInt();

            Integer[] arTemp= new Integer[l];

            for(int j=0;j<l;j++){
                arTemp[j]= sc.nextInt();
            }

            arr.add(arTemp);
        }

        int q= sc.nextInt();

        for(int i=0;i<q;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();

            try{
                Integer[] array= arr.get(x-1);
                Integer res= array[y-1];
                System.out.println(res);

            }catch(Exception e){System.out.println("Error!");}
        }

    }
}
