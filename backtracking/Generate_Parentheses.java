package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", n, n);
        return list;
    }
    public void helper(List<String> list, String out, int left, int right){
        if(left < 0 || right < 0 || left > right)   return;
        if(left == 0 && right == 0){
            list.add(out);
        }
        helper(list, out + "(", left - 1, right);
        helper(list, out + ")", left, right - 1);
    }
}
