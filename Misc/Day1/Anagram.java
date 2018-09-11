package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        int testCases= s.nextInt();
        s.nextLine();
        for(int i=0;i<testCases;i++){

            String a= s.nextLine();
            String b= s.nextLine();

            Arrays.asList(a);
            char[] aArr=a.toCharArray();
            char[] bArr=b.toCharArray();

            ArrayList<Character> aList= new ArrayList<>();
            ArrayList<Character> bList= new ArrayList<>();

            for(int j=0;j<aArr.length;j++){
                aList.add(aArr[j]);
            }
            for(int j=0;j<bArr.length;j++){
                bList.add(bArr[j]);
            }

            int j=0;
            while(j<aList.size()){

                Character c= aList.get(j);
                if(bList.contains(c)){
                   aList.remove(c);
                   bList.remove(c);

                }
                else{
                    j++;
                }
            }


            System.out.println(aList);
            System.out.println(bList);
            System.out.println(aList.size()+bList.size());



        }




    }
}
