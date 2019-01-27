package divide_and_conquer;

public class Search_a_2D_Matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length < 1)	return false;
       int row = matrix.length;
       int col = matrix[0].length;
       for(int i = 0, j = col - 1; i < row && j >= 0; ) {
    	   if(target == matrix[i][j]) {
    		   return true;
    	   }else if(target > matrix[i][j]) {
    		   i++;
    	   }else {
    		   j--;
    	   }
       }
       return false;
    }
}
