package HackerRank.DataStructure.BigDecimal;

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
       //  Arrays.parallelSort();
        //Write your code here
        // Use insertion sort as it is stable as we need to keep the relative position same

        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                BigDecimal a=new BigDecimal(s[j]);
                BigDecimal b= new BigDecimal(s[j-1]);
                if(a.compareTo(b)==1){
                    String temp= s[j];
                    s[j]=s[j-1];
                    s[j-1]=temp;

                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
