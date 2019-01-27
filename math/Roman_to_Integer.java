package math;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {

	public int romanToInt(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		if(s.length() == 1){
			result = map.get(s.charAt(0));
		}else{
			
			for(int i = 0; i < s.length() - 1; i++){
				if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
					result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
					
					i++;
				}else{
					result += map.get(s.charAt(i));
				}
			}

			if(map.get(s.charAt(s.length() - 1)) <= map.get(s.charAt(s.length() - 2))){
				result += map.get(s.charAt(s.length() - 1));
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		Roman_to_Integer mainTest = new Roman_to_Integer();
		String s = "CCCI";
		int result = mainTest.romanToInt(s);
		System.out.println(result);
	}
}
