package array;

public class Monotonic_Array {
    public boolean isMonotonic(int[] A) {
    	int c = 0;
    	int store = 0;
    	for(int i = 0; i < A.length - 1; i++){
    		c = Integer.compare(A[i], A[i + 1]);
    		if(c != 0){
        		if(c != store && store != 0){
        			return false;
        		}
        		store = c;
    		}
    	}
    	return true;
    }
}
