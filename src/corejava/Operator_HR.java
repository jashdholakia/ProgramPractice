package corejava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operator_HR {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	
        double tip_percentage= findPercentage(tip_percent);
        System.out.println("tip_percentage: "+tip_percentage);
        double tip= meal_cost*tip_percentage;
        System.out.println("tip: "+tip);
        
        double tax_percentage= findPercentage(tax_percent);
        double tax= meal_cost*tax_percentage;
        long total= Math.round(meal_cost+tip+tax);
        System.out.println(total);
    }

    static double findPercentage(int upper)
    {
    	double d= 20/100;
        return (double)upper/100;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
