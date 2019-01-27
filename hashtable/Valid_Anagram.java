package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Valid_Anagram {
	//sort
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length())	return false;
//        char[] str1 = s.toCharArray();
//        char[] str2 = t.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        return Arrays.equals(str1, str2);
//    }
	
//	public boolean isAnagram(String s, String t) {
//		if(s.length() != t.length())	return false;
//		int[] counter = new int[26];
//		for(int i = 0; i < s.length(); i++){
//			counter[s.charAt(i) - 'a']++;
//			counter[t.charAt(i) - 'a']--;
//		}
//		for(int count : counter){
//			if(count != 0){
//				return false;
//			}
//		}
//		return true;
//	}
	
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())	return false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i) + 1));
				continue;
			}else if(map.containsKey(t.charAt(i))){
				map.put(t.charAt(i), map.get(t.charAt(i) - 1));
				continue;
			}
			map.put(s.charAt(i), 1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() != 0){
				return false;
			}
		}
		return true;
	}
	
}
