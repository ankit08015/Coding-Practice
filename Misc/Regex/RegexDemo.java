package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {

    public static void main(String[] args){

        Pattern p= Pattern.compile("aba");
        Matcher m= p.matcher("abaababaaaaba");
        int count =0;

        while(m.find()){
            count++;

            System.out.println(m.start()+"...."+m.end()+"...."+m.group());
        }

        System.out.println("Number of occurence is: "+count);

    }
}
