package corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class mapDir_HR {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<>();
        List<String>queryList= new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            Integer phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
         	if(phoneBook.get(s)!=null)
        	{
        		System.out.println(s+"="+phoneBook.get(s));
        	}
         	else
         	{
         		System.out.println(s+"=not found");
         	}
        }

        in.close();
    }

}
