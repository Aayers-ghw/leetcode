package math;

public class Reverse_Integer {

	public int reverse(int x) {
		
        boolean negative = x < 0;
        
        if(negative) x = -x;
        
        long result = 0;
        
        while(x != 0){
        	result = result * 10 + x % 10;
        	x = x / 10;
        }
        
        if(negative) result = -result;
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
		
        return (int)result;
    } 
}
