package crackingCodingInterview;

import java.util.LinkedList;
import java.util.Scanner;




class MyStack{
	
	char data;
	//int capacity;

	LinkedList<Character> al = new LinkedList<>();
	
	//char arr[] = new char[capacity];
	void push(char data){
		al.add(data);
	}
	
	char pop(){
		
		char top =al.getLast();
		al.removeLast();
		return top;
	}
}
public class BalancedBrackets {
	
	
	
	public static void main (String args[]){
		
		//BalancedBrackets bb =new BalancedBrackets();
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int a0 = 0; a0 < t; a0++) {
	            String expression = in.next();
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	        }
	        
	}   
	     
	
	public static boolean isBalanced(String expression){
	    	   
	    	 
	    	   MyStack myStack = new MyStack();
	    	   Boolean flag= true;
	    	  
	    	   for (int i = 0; i < expression.length(); i++) {
	    		   
	    		   //opening brackets
				if(expression.charAt(i)=='['||expression.charAt(i)=='{'||expression.charAt(i)=='('){
					myStack.push(expression.charAt(i));
				}
				
				 if(expression.charAt(i)==']'||expression.charAt(i)=='}'||expression.charAt(i)==')'){
					if(myStack.al.isEmpty())
						return false;
					char top =myStack.pop();
					if(expression.charAt(i)==']'&&top == '['){
						continue;
					}else if(expression.charAt(i)=='}'&&top=='{'){
						continue;
					}else if(expression.charAt(i)==')'&&top=='('){
						continue;
					}else{
						flag=false;
						break;
					}
				}
			}
	    	   
	    	   if(!myStack.al.isEmpty())
		    	   return false;
	    	   
	    	   if(flag==true)
	    	   return true;
	    	   else
	    		   return false;
	       }
	 
		
		
		
	}

