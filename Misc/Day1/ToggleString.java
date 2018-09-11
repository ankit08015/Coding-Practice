package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleString {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        char[] cArr = str.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] > 96) {
                cArr[i] = (char) (cArr[i] - 32);

            } else {
                cArr[i] = (char) (cArr[i] + 32);
            }
        }


        System.out.println(new String(cArr));
        //for(int i=0;i<cArr.length;i++)System.out.print(cArr[i]);



    }

}
