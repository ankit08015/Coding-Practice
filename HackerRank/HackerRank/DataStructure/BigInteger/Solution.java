package HackerRank.DataStructure.BigInteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan= new Scanner(System.in);

        String A= scan.nextLine();
        String B= scan.nextLine();

        scan.close();

        BigInteger a= new BigInteger(A);
        BigInteger b= new BigInteger(B);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}
