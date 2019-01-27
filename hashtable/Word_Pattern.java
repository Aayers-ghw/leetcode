package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length)	return false;
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < pattern.length(); i++){
        	if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(words[i]))	return false;
        	if(!map.containsKey(pattern.charAt(i)) && map.containsValue(words[i]))	return false;
        	map.put(pattern.charAt(i), words[i]);
        }
        return true;
    }
}
