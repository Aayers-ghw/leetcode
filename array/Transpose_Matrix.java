package array;

public class Transpose_Matrix {
    public int[][] transpose(int[][] A) {
    	int[][] res = new int[A.length][A[0].length];
    	for(int i = 0; i < A.length; i++){
    		for(int j = 0; j < A[0].length; j++){
    			res[i][j] = A[j][i];
    		}
    	}
    	return res;
    }
}
