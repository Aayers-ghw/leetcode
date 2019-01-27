package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Minimum_Index_Sum_of_Two_Lists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> res = new ArrayList<String>();
        
        for(int i = 0; i < list1.length; i++) {
        	map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i++) {
        	Integer j = map.get(list2[i]);
        	if(j != null && i + j <= minSum) {
        		if(i + j < minSum) {
        			minSum = i + j;
        			res.clear();
        		}
        		res.add(list2[i]);
        	}
        }
        
        return res.toArray(new String[res.size()]);
    }
}
