package HackerRank.DataStructure.JavaStringToken;

import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        char[] c=s.toCharArray();
        int count=0;

        String str= "";
     //   str= str+'a';

     ArrayList<String> strList= new ArrayList<>();


        for(int i=0;i<c.length;i++){

            if(c[i]>='a'&&c[i]<='z'){
                str= str+c[i];
            }

            else if(c[i]>='A'&&c[i]<='Z'){
                str= str+c[i];
            }

            else{
                if(!str.equals(""))strList.add(str);
                str="";
            }

        }
        if(!str.equals(""))strList.add(str);


        System.out.println(strList.size());
        for(String st:strList){
            System.out.println(st);
        }
        scan.close();
    }
}

