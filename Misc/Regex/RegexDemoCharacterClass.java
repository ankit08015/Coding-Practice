package Regex;

import java.util.regex.*;

public class RegexDemoCharacterClass {

    public static void main(String args[]){
        Pattern p= Pattern.compile("[a-z0-9]");

        Matcher m= p.matcher("a9@3b7Z. ab#J");

        while(m.find()){
            System.out.println(m.start()+"...."+m.end()+"...."+m.group());
        }
    }
}
