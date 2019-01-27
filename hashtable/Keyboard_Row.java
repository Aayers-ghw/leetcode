package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keyboard_Row {

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<String>();
        
        char[] row1 = new char[]{'q','w','e','r','t','y','u','i','o','p'};  
        char[] row2 = new char[]{'a','s','d','f','g','h','j','k','l'};  
        char[] row3 = new char[]{'z','x','c','v','b','n','m'};
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < row1.length; i++) {
        	map.put(row1[i], 1);
        }
        for(int i = 0; i < row2.length; i++) {
        	map.put(row2[i], 2);
        }
        for(int i = 0; i < row3.length; i++) {
        	map.put(row3[i], 3);
        }
        
        int row = 0;
        for(int i = 0; i < words.length; i++) {
        	String word = words[i].toLowerCase();
        	int flag = 0, j = 0;
        	for(; j < word.length(); j++) {
        		if(flag == 0) {
        			row = map.get(word.charAt(j));
        			flag = 1;
        		}else {
        			if(map.get(word.charAt(j)) != row) {
        				break;
        			}
        		}
        	}
        	if(j == word.length()) {
        		res.add(words[i]);
        	}
        }
        
        String[] result = new String[res.size()];
        for(int i = 0;i < res.size(); i++) {
        	result[i] = res.get(i);
        }
        return result;
    }
}
