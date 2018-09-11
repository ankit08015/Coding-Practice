package Regex;

import java.util.regex.*;

public class RegexDemoQuantifiers {

    public static void main(String args[]){

        Pattern p= Pattern.compile("a?");

        Matcher m= p.matcher("abaabaaab");

        while(m.find()){
            System.out.println(m.start()+"...."+m.end()+"...."+m.group());
        }
    }
}

/**
 * a ---> exactly 1a
 a+ -----> at least 1 a
 a* --------> any number of a including 0 also
 a? --------> at most 1 a
 */
