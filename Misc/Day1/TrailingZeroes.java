package Day1;



/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;


public class TrailingZeroes {
    public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);



        // Write your code here
        int testCase= s.nextInt();
        for(int i=0;i<testCase;i++){
            int zero= s.nextInt();
            int num=0;
            ArrayList<Integer> list= new ArrayList<>();

            while(true){
                int temp=0;

                int k=num;
                while(k>0){
                  temp=temp+k/5;
                  k=k/5;
                }
                if(temp==zero)list.add(num);
                if(temp>zero)break;
                num++;

            }
            System.out.println(list.size());
            for(int x:list)System.out.print(x+" ");

        }

    }
}

