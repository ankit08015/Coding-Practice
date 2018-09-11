package Day1;

import java.util.Scanner;

public class SeatArr {

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s= new Scanner (System.in);
        int run=s.nextInt();
        for(int i=0;i<run;i++) {


            int N = s.nextInt();
            String seat = null;
            int facingSeatNum = 0;

            if (N % 6 == 0 || N % 6 == 1) {
                seat = "WS";
            } else if (N % 6 == 2 || N % 6 == 5) {
                seat = "MS";
            } else {
                seat = "AS";
            }

            int q = N / 6;
            int m = N % 6;

            if (q % 2 == 0) {
                if (m == 0) {
                    facingSeatNum = N - 11;
                } else if (m == 1) {
                    facingSeatNum = N + 11;

                } else if (m == 2) {
                    facingSeatNum = N + 9;

                } else if (m == 3) {
                    facingSeatNum = N + 7;

                } else if (m == 4) {
                    facingSeatNum = N + 5;

                } else if (m == 5) {
                    facingSeatNum = N + 3;

                }

            } else {

                if (m == 0) {
                    facingSeatNum = N + 1;
                } else if (m == 1) {
                    facingSeatNum = N - 1;

                } else if (m == 2) {
                    facingSeatNum = N - 3;

                } else if (m == 3) {
                    facingSeatNum = N - 5;

                } else if (m == 4) {
                    facingSeatNum = N - 7;

                } else if (m == 5) {
                    facingSeatNum = N - 9;

                }

            }

            System.out.println(facingSeatNum + " " + seat);
        }

    }
}
