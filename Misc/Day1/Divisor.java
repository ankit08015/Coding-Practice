package Day1;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Divisor {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);

        int l=s.nextInt();
        int r= s.nextInt();
        int k=s.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0)count++;
        }

        System.out.println(count);


    }
}
