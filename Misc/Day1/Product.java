package Day1;

import java.util.Scanner;

public class Product {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=s.nextInt();

        }

        double answer=1;
        for(int i=0;i<N;i++){
            answer= ((answer*arr[i])%(Math.pow(10,9)+7));
        }

        System.out.println((int)answer);
    }
}
