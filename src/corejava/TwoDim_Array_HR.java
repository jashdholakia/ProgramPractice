package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoDim_Array_HR {
	
	/**
	 * sample input
	 *  1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0
	 */
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }
	      
	       List<Integer> result= new ArrayList<>();
	        for(int i=0;i<=3;i++)
	        {
	        	int n=0;
	        	int firstpart=0;
	        	int midpart=0;
	        	int lastpart=0;
	        	while(n<=3)
	        	{
	        		firstpart= arr[i][n]+arr[i][n+1]+arr[i][n+2];
	        		midpart=arr[i+1][n+1];
	        		lastpart=arr[i+2][n]+arr[i+2][n+1]+arr[i+2][n+2];
	        		result.add(firstpart+midpart+lastpart);
	        		n++;
	        	}
	        }
	        Collections.sort(result);
	        System.out.println(result.get(result.size()-1));
	        
	        
	    }

}
