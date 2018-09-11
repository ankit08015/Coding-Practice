package HackerRank.DataStructure.StringPalindrome;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int l= A.length();
        int lo=0;
        int hi= l-1;
        boolean isPalindrome=true;

        while(lo<hi){
            if(A.charAt(lo++)!=A.charAt(hi--)){
                isPalindrome=false;
                break;
            }

        }

        System.out.println(isPalindrome?"Yes":"No");



    }
}

