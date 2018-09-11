package Day1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        char[] cArr=name.toCharArray();

        int i=0;
        int j= cArr.length-1;

        while(i<j){
            if(cArr[i++]!=cArr[j--]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
