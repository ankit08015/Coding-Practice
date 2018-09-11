package Regex;

import java.util.regex.*;

public class RegexDemoPatternSplit {

    public static void main(String[] args){

        Pattern p= Pattern.compile("\\W");/// split space- \\s, split for all special character \\W.

        String [] s1= p.split("ankit is good boy.");

        for(String str:s1)System.out.println(str);

        Pattern p1= Pattern.compile("\\.");

        String s2[]= p1.split("www.facebook.com");

        for(String str:s2)System.out.println(str);



    }
}
