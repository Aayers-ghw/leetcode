package array;

public class _1bit_and_2bit_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length - 1){
        	if(bits[i] == 1){
        		i += 2;
        	}else{
        		i += 1;
        	}
        }
        return i == bits.length - 1;
    }
}
