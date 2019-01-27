package hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] res = new int[26];
        for(int i = 0; i < s.length(); i++){
        	res[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
        	if(res[s.charAt(i) - 'a'] == 1){
        		return i;
        	}
        }
        return -1;
    }
}
