package hashtable;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
    public boolean isHappy(int n) {
    	Set<Integer> inLoop = new HashSet<Integer>();
    	int sum , tmp;
    	while(inLoop.add(n)){
    		sum = 0;
    		while(n > 0){
    			tmp = n % 10;
    			sum += tmp * tmp;
    			n /= 10;
    		}
    		if(sum == 1){
    			return true;
    		}
    		n = sum;
    	}
    	return false;
    }
}
