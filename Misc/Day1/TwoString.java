package Day1;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;



class TwoString {
    public static void main(String args[] ) throws Exception {
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

        // Write your code
        Scanner s = new Scanner(System.in);
        int testCase=s.nextInt();
        s.nextLine();

        for(int i=0;i<testCase;i++){


                String a=s.nextLine();
                String b=s.nextLine();
                twoString(a,b);
        }
    }

    private static void twoString(String a, String b) {

        char[] charA=a.toCharArray();
        char[] charB=b.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);

        if(new String(charA).equals(new String(charB))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }
    }
}

