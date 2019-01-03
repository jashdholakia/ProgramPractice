package corejava;

import java.util.Scanner;

public class ScanDataType_HR {
			
		    public static void main(String[] args) {
		        int i = 4;
		        double d = 4.0;
		        String s = "HackerRank ";
				
		        Scanner scan = new Scanner(System.in);

		        /* Declare second integer, double, and String variables. */
		        int j= scan.nextInt();
		        double e= scan.nextDouble();
		        String str= scan.next();
		        String str1=scan.nextLine();
		        str= str.concat(str1);
		        System.out.println(str);
		    
		        /* Print the sum of both integer variables on a new line. */
		            System.out.println(i+j);

		        /* Print the sum of the double variables on a new line. */
				System.out.println(d+e);
		        /* Concatenate and print the String variables on a new line; 
		        	the 's' variable above should be printed first. */
		System.out.println(s.concat(str));
		        scan.close();
		
	}

}
