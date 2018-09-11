package Day7;

import java.io.*;
import java.util.*;


class Solution {
    public int hammingDistance(int x, int y) {

        int[] xArr=new int[32];
        int[] yArr=new int[32];
        int i=0;
        int j=0;

        int count=0;

        System.out.println("for x: "+x);

        while(x!=0){
            int rem= x%2;
            x=x/2;
            System.out.println(rem);
            xArr[i]=rem;
            i++;
        }



        System.out.println("for y: "+ y);

        while(y!=0){
            int rem= y%2;
            y=y/2;
            yArr[j]=rem;
            System.out.println(rem);
            j++;
        }

        for(int k=0;k<31;k++)
        {

            System.out.print(yArr[k]);
        }

        System.out.println();

        for(int k=0;k<31;k++)
        {

            System.out.print(xArr[k]);
        }


        for(int k=0;k<31;k++)
        {
            if(xArr[k]!=yArr[k]){
                count++;
            }

        }

        return count;

    }

    public boolean judgeCircle(String moves) {

        int x=0;
        int y=0;

        char [] charArray= moves.toCharArray();

        for(int i=0;i<charArray.length;i++){
            if (charArray[i]=='L') {
                y--;

            }
            else  if (charArray[i]=='R') {
                y++;

            }
            else  if (charArray[i]=='U') {
                x++;

            }
            else{
                x--;
            }
        }

        if(x==0 && y==0)return true;
        return false;

    }

    public static void main(String [] args){
        int x=1;
        int y=3;
        Solution s= new Solution();
        System.out.println("distance is: "+s.hammingDistance(x,y));
    }
}
