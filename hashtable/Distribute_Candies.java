package hashtable;

import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies {

    public int distributeCandies(int[] candies) {
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i = 0; i < candies.length; i++) {
    		set.add(candies[i]);
    	}
    	if(set.size() >= (candies.length / 2)) {
    		return candies.length / 2;
    	}else {
    		return set.size();
    	}
    }
}
