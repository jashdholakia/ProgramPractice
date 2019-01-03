package corejava;

import java.util.Stack;

public class StackReverse {
	static Stack s = new Stack();
	public static void main(String[] args) {
	
	
		s.push('1');
		s.push('2');
		s.push('3');
		System.out.println(s);
		reverseStack();
		System.out.println(s);

	}

	public static void reverseStack()
	{
		if(s.size() > 0) 
        { 
            char x = (char) s.peek(); 
            s.pop(); 
            reverseStack(); 
            insertAtBottom(x); 
        } 
		
	}
	
	public static void insertAtBottom(char x)
	{
		if(s.isEmpty()) 
            s.push(x); 
  
        else
        { 
     
            char a = (char) s.peek(); 
            s.pop(); 
            insertAtBottom(x); 
            s.push(a); 
        } 
	}
}
