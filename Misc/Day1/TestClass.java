package Day1;
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine().trim());
        long k = Long.parseLong(br.readLine().trim());
        String[] arr_arr = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
        {
            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
        }

        long out_ = Solve(k, arr);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long Solve(long k, int[] arr){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        return sum;

    }
}

