package Regex;

import java.util.regex.*;

public class RegexDemoPreDefinedCharacterClass {

    public static void main(String[] args){

        Pattern p= Pattern.compile(".");// . is very imp

        Matcher m= p.matcher("a7b k@9 #L");

        while(m.find()){
            System.out.println(m.start()+"...."+m.end()+"...."+m.group());
        }
    }
}
