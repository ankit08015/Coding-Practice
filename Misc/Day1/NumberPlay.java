package Day1;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;


class NumberPlay {
    public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);



        // Write your code here
        int len=s.nextInt();
        int query= s.nextInt();

        long[] array= new long[len];
        long count=0;

        for(int i=0;i<len;i++){
            count=count+ s.nextInt();
            array[i]=count;
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for(int i=0;i<query;i++){
            int start= s.nextInt();
            int end= s.nextInt();
            int num= end-start+1;
            long sum=0;

            end=end-1;
            start=start-2;
            if(start<0)sum=array[end];
            else sum=  (array[end]-array[start]);

            System.out.println(Math.floorDiv(sum,num));

        }


    }
}

