package array;

import java.util.HashSet;
import java.util.Set;

public class Fair_Candy_Swap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int suma = 0, sumb = 0;
        for(int i = 0; i < A.length; i++){
        	suma += A[i];
        }
        for(int i = 0; i < B.length; i++){
        	sumb += B[i];
        }
        
        int delta = (sumb - suma) / 2;
        Set<Integer> setB = new HashSet<Integer>();
        
        for(int i = 0; i < B.length; i++){
        	setB.add(B[i]);
        }
        for(int i = 0; i < A.length; i++){
        	if(setB.contains(A[i] + delta)){
        		return new int[]{A[i], A[i] + delta};
        	}
        }
        return null;
    }
}
