package array;

public class Squares_of_a_Sorted_Array {

	public int[] sortedSquares(int[] A) {
        if(A == null || A.length == 0){
            return new int[0];
        }
        int[] res = new int[A.length];
        int i = 0, j = A.length - 1;
        for(int k = j; k >= 0; --k){
            if(Math.abs(A[i]) < Math.abs(A[j])){
                res[k] = A[j] * A[j];
                j--;
            }else{
                res[k] = A[i] * A[i];
                i++;
            }
        }
        return res;
    }
}
