package HackerRank.DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContentExtractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern p= Pattern.compile("(<)(.+)(>)(.+)(</)(\\2)(>)");

        // <h1>Nayeem loves counseling</h1>


        while(testCases>0){
            String line = in.nextLine();

          //  String[] s= p.split(line);

            Matcher m= p.matcher(line);

            if(m.find()){
                // System.out.println("here");


                String newStr= m.group(4);
                Matcher m1= p.matcher(m.group(4));

                while(m1.find()){
                    newStr= m1.group(4);
                    m1=p.matcher(m1.group(4));
                }

                System.out.println(newStr.length()+newStr);

            }

            else{
                System.out.println("None");
            }



          //  for(String st:s)System.out.println(st);



            testCases--;
        }
    }
}

