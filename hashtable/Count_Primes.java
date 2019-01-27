package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Count_Primes {
    public int countPrimes(int n) {
    	boolean[] flag = new boolean[n];
    	int cnt = 0;
    	for(int i = 2; i < n; i++){
    		if(flag[i] == false){
    			cnt++;
    			for(int j = i + i; j < n; j += i){
    				flag[j] = true;
    			}
    		}
    	}
    	return cnt;
    }
}
