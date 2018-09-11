package HackerRank.DataStructure.StringAnagrams;

import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())return false;
      //  boolean isAnagram;
        a=a.toUpperCase();
       b= b.toUpperCase();

        System.out.println("A= "+a+" B= "+b);

        char[] strA= a.toCharArray();
        char[] strB= b.toCharArray();

        Arrays.sort(strA);
        Arrays.sort(strB);

        for(int i=0;i<a.length();i++){
            if(strA[i]!=strB[i])return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

