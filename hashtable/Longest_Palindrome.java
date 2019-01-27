package hashtable;

import java.util.HashSet;

public class Longest_Palindrome {
    public int longestPalindrome(String s) {
     
    	HashSet<Character> set = new HashSet<>();
    	int ans = 0;
    	for(int i = 0; i < s.length() ;i++) {
    		if(set.contains(s.charAt(i))) {
    			set.remove(s.charAt(i));
    			ans++;
    		}else {
    			set.add(s.charAt(i));
    		}
    	}
    	
    	if(!set.isEmpty()) return ans * 2 + 1;
    	return ans * 2;
    }
}
