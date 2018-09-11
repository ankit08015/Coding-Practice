package HackerRank.DataStructure.ArrayManipulation.CurrencyFormat;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat in=NumberFormat.getCurrencyInstance();
        String us= in.format(payment);

        Locale french = new Locale("fr", "FR");
        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(french);
        String france= frenchFormat.format(payment);

        Locale indian = new Locale("en", "IN");
        NumberFormat indianFr = NumberFormat.getCurrencyInstance(indian);
        String india= indianFr.format(payment);

        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("￥");
        dfs.setMonetaryDecimalSeparator('.');
        dfs.setGroupingSeparator(',');
        df.setDecimalFormatSymbols(dfs);
        String china= df.format(payment);



        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

