package stack;

import java.util.Stack;

public class Valid_Parentheses {
	
	 public boolean isValid(String s){
		
		 Stack<Character> st = new Stack<Character>();
		 
		 for(int i = 0; i < s.length(); i++){
			 if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
				 st.push(s.charAt(i));
			 }else if(st.empty()){
				 return false;
			 }else{
				 if(s.charAt(i) == ')' && st.peek() != '(' || s.charAt(i) == '}' && st.peek() != '{' || s.charAt(i) == ']' && st.peek() != '['){
					 return false;
				 }else{
					 st.pop();
				 }
			 }
			 
		 }
		 if(st.empty()){
			 return true;
		 }else{
			 return false;
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 Valid_Parentheses mainTest = new Valid_Parentheses();
		 boolean flag = mainTest.isValid("[");
		 System.out.println(flag);
	 }
}
