package Day1;

    /* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;



public class GCD {
        public static void main(String args[] ) throws Exception {


            //Scanner
            Scanner s = new Scanner(System.in);



            // Write your code here
            int testCase= s.nextInt();
            for(int j=0;j<testCase;j++){
                int strLen= s.nextInt();
                int ones= s.nextInt();
                String ans="1";
                int count=0;
                for(int i =1;i<strLen;i++){
                    if(count==ones-1){
                        ans=ans+"1";
                        count=0;
                    }
                    else{
                        count=count+1;
                        ans=ans+"0";
                    }
                }
                System.out.println(ans);
                long foo = binaryToInteger(ans) ;
                System.out.println(foo);
            }

        }
    public static long binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        long result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return (long) (result%(Math.pow(10,9)+7));
    }
    }

