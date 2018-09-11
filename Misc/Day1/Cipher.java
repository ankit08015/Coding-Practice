package Day1;

import java.util.Scanner;

public class Cipher {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        String msg= s.nextLine();
        int key= s.nextInt();

        char[] charArray= msg.toCharArray();

        for(int i=0;i<charArray.length;i++){
            int num= charArray[i];
            if(num>=65 && num<=90){
                num=num+key%26;
                if(num>90){
                    num=(num-90)+64;
                }
                charArray[i]= (char) num;
            }
            if(num>=97 && num<=122){
                num=num+key%26;
                if(num>122){
                    num=(num-122)+96;
                }
                charArray[i]= (char) num;
            }
            if(num>=48 && num<=57){
                num=num+key%10;
                if(num>57){
                    num=(num-57)+47;
                }
                charArray[i]= (char) num;
            }

        }

        System.out.println(new String(charArray));


    }
}
