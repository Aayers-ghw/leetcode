package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Number_of_Boomerangs {

    public int numberOfBoomerangs(int[][] points) {
    	
    	int res = 0;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < points.length; i++) {
        	for(int j = 0; j < points.length; j++) {
        		if(j == i)	continue;
        		int d = getDistance(points[i], points[j]);
        		int tmp = map.containsKey(d) ? map.get(d) : 0;
        		res += 2 * tmp;
        		map.put(d, tmp + 1);
        	}
        	map.clear();
        }
        return res;
    }
    private int getDistance(int[] a, int[] b) {
    	int dx = a[0] - b[0];
    	int dy = a[1] - b[1];
    	return dx * dx + dy * dy;
    }
}
