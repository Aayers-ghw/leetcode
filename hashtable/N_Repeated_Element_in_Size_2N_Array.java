package hashtable;

import java.util.HashMap;
import java.util.Map;

public class N_Repeated_Element_in_Size_2N_Array {

	// public int repeatedNTimes(int[] A) {
    //     if(A == null || A.length == 0){
    //         return -1;
    //     }        
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int val : A){
    //         map.put(val, map.getOrDefault(val, 0) + 1);
    //     }
    //     for(int val : A){
    //         if(map.get(val) > 1){
    //             return val;
    //         }
    //     }
    //     return -1;
    // }
	
    public int repeatedNTimes(int[] A) {
        for(int i = 2; i < A.length; ++i){
            if(A[i] == A[i - 1] || A[i] == A[i - 2]){
                return A[i];
            }
        }
        return A[0];
    }
}
