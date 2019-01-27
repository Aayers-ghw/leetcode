package hashtable;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        if(s == null || p == null) return list;
        int left = 0, right = 0, count = p.length();
        int[] map = new int[256];
        char[] sc = s.toCharArray();
        for(char c : p.toCharArray())	map[c]++;
        while(right < s.length()) {
        	if(map[sc[right++]]-- >=1)	count--;
        	if(count == 0)	list.add(left);
        	if(right - left == p.length() && map[sc[left++]]++ >=0)	count++;
        }
        return list;
    }
}
