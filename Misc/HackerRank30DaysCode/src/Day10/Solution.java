package Day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int max=0,count=0, rem=0;

        while(n!=0){
            rem=n%2;
            if(rem==1){
                count++;

            }
            else{
                if(count>max)max=count;
                count=0;
            }
            n=n/2;
        }

        if(count>max)max=count;

        System.out.println(max);
    }
}

