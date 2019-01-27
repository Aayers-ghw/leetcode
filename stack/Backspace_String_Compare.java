package stack;

import java.util.Stack;

public class Backspace_String_Compare {

	public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(int i = 0; i < S.length(); ++i){
            if(S.charAt(i) != '#'){
                s1.push(S.charAt(i));
            }else{
                if(!s1.empty()){
                    s1.pop();
                }
            }
        }
        for(int i = 0; i < T.length(); ++i){
            if(T.charAt(i) != '#'){
                s2.push(T.charAt(i));
            }else{
                if(!s2.empty()){
                    s2.pop();
                }
            }
        }
        
        return s1.equals(s2);
    }
}
