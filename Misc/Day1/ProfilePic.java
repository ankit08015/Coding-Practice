package Day1;

import java.util.Scanner;

public class ProfilePic {

    public static void main(String [] args){
        Scanner s= new Scanner(System.in);

        int l= s.nextInt();

        int testCases= s.nextInt();


        for(int i=0;i<testCases;i++){
            int w= s.nextInt();

            int h= s.nextInt();


            if(w<l||h<l){
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w==l&&h==l){
                System.out.println("ACCEPTED");

            }
            else if(w==h){
                System.out.println("ACCEPTED");

            }


            else {
                System.out.println("CROP IT");
            }
        }
    }
}
