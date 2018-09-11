package Regex;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num=  scan.nextInt();
        String emailRegEx = "[a-z]+@gmail\\.com$";
       // scan.nextLine();

        Pattern pattern= Pattern.compile(emailRegEx);

        ArrayList<String> name= new ArrayList<>();
        for(int i=0;i<num;i++){
            String fName= scan.next();
            String email= scan.next();
            Matcher m= pattern.matcher(email);
            if(m.find()){
                name.add(fName);
            }
        }

        Collections.sort(name);
        for(String s: name)System.out.println(s);
    }
}
