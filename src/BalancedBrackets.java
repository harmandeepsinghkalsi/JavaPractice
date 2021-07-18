import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
			Stack<Character> stk = new Stack<>();

            boolean isBalanced = true;
            //Complete the code
            for(int i = 0 ;i<input.length();i++){
                if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='['){
                    stk.push(input.charAt(i));
                } else if(input.charAt(i)=='}' || input.charAt(i)==')' || input.charAt(i)==']'){
                    if(stk.isEmpty()){
                        isBalanced=false;
                        break;
                    } else {
                        char top = stk.peek();

                        if(top=='{' && input.charAt(i)=='}' || top=='[' && input.charAt(i)==']' || top=='(' && input.charAt(i)==')'){
                            stk.pop();
                        } else{
                            isBalanced = false;
                            break;
                        }

                    }
                }
            }
            if(!stk.isEmpty()) {
                isBalanced = false;
            }
            System.out.println(isBalanced);
		}
		
	}
}
