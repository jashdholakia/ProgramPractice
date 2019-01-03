package corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class Condition_HR
{
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int numOfString= input.nextInt();
		String str[]= new String[numOfString];

		if(numOfString>=0 && numOfString<=10)
		{
			for(int i=0;i<numOfString;i++)
			{
				str[i]= input.next();
			}
		
			for(int i=0;i<numOfString;i++)
			{
				if(str[i].length()>=2 && str[i].length()<=10000)
				{
					char[] charArray= str[i].toCharArray();
					StringBuffer sb_even= new StringBuffer();
					StringBuffer sb_odd= new StringBuffer();
					for(int j=0;j<str[i].length();j++)
					{
						if(j%2==0)
						{
							sb_even.append(charArray[j]);
						}
						else
							sb_odd.append(charArray[j]);
						
					}
					sb_even.append("  ").append(sb_odd);
					System.out.println(sb_even);
				
				}
			}
		}
	}
}
