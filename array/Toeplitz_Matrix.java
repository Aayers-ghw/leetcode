package array;

import java.util.HashMap;
import java.util.Map;

public class Toeplitz_Matrix {
//    public boolean isToeplitzMatrix(int[][] matrix) {
//        Map<Integer, Integer> groups = new HashMap<Integer, Integer>();
//        for(int i = 0; i < matrix.length; i++){
//        	for(int j = 0; j < matrix[0].length; j++){
//        		if(!groups.containsKey(i - j)){
//        			groups.put(i - j, matrix[i][j]);
//        		}else if(matrix[i][j] != groups.get(i - j)){
//        			return false;
//        		}
//        	}
//        }
//        return true;
//    }
	
	public boolean isToeplitzMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}
