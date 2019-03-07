package array;

import java.util.Arrays;

public class Largest_Perimeter_Triangle {

    public int largestPerimeter(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        Arrays.sort(A);
        for(int i = A.length - 3; i >= 0; --i){
            if(A[i] + A[i + 1] > A[i + 2]){
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }
}
