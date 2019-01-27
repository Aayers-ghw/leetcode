package stack;

import java.util.Stack;

public class Baseball_Game {

	public int calPoints(String[] ops) {
        Stack<Integer> s1 = new Stack<Integer>();
        for(String op : ops){
            if(op.equals("C")){
                s1.pop();
            }else if(op.equals("D")){
                s1.push(2 * s1.peek());
            }else if(op.equals("+")){
                int top = s1.pop();
                int newTop = s1.peek() + top;
                s1.push(top);
                s1.push(newTop);
            }else{
                s1.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        while(!s1.empty()) ans += s1.pop();
        return ans;
    }
}
