package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Letter_Case_Permutation {

//	//Solution I
//	public List<String> letterCasePermutation(String S) {
//        if(S == null)   return new ArrayList<String>();
//        
//        Queue<String> queue = new LinkedList<>();
//        queue.offer(S);
//        for(int i = 0; i < S.length(); ++i){
//            if(Character.isDigit(S.charAt(i)))  continue;
//            int size = queue.size();
//            for(int j = 0; j < size; ++j){
//                String cur = queue.poll();
//                char[] chs = cur.toCharArray();
//                
//                chs[i] = Character.toUpperCase(chs[i]);
//                queue.offer(String.valueOf(chs));
//                
//                chs[i] = Character.toLowerCase(chs[i]);
//                queue.offer(String.valueOf(chs));
//            }
//        }
//        return new ArrayList<>(queue);
//    }
	
	//Solution II
	public List<String> letterCasePermutation(String S) {
        if(S == null)   return new ArrayList<>();
        
        List<String> list = new ArrayList<>();
        helper(list, S.toCharArray(), 0);
        return list;
    }
    public void helper(List<String> list, char[] chs, int index){
        if(chs.length == index){
            list.add(new String(chs));
            return;
        }
        if(chs[index] >= '0' && chs[index] <= '9'){
            helper(list, chs, index + 1);
            return;
        }
        chs[index] = Character.toUpperCase(chs[index]);
        helper(list, chs, index + 1);
        chs[index] = Character.toLowerCase(chs[index]);
        helper(list, chs, index + 1);
    }
}
