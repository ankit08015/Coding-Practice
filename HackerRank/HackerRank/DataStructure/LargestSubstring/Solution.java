package HackerRank.DataStructure.LargestSubstring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int l= s.length();

        int nums=l-k+1;

        String[] str= new String[nums];

        for(int i=0;i<nums;i++){
            str[i]= s.substring(i,i+k);

        }

        Arrays.sort(str);

        smallest= str[0];
        largest= str[str.length-1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

