package HackerRank.DataStructure.reSizeArray;

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
     //   int []seq[]= new int[n][1000];
        ArrayList<ArrayList<Integer>> seq= new ArrayList<>();
        int q= scan.nextInt();

      /*  for(int i=0;i<n;i++){
            for(int j=0;j<1000;j++){
                seq[i][j]= Integer.MIN_VALUE;
            }
        } */

      for(int i=0;i<n;i++){
          ArrayList <Integer> temp= new ArrayList<>();
          seq.add(temp);
      }

        int lastAnswer=0;

        for(int i=0;i<q;i++){
            int query= scan.nextInt();
            int x= scan.nextInt();
            int y= scan.nextInt();

            if(query==1){

                int se= (x^lastAnswer)%n;

                seq.get(se).add(y);



            }





            else{

                int se= (x^lastAnswer)%n;
                int element= y%(seq.get(se).size());
                lastAnswer= seq.get(se).get(element);

                System.out.println(lastAnswer);

            }
        }
    }
}
