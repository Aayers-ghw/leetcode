package array;

import java.util.LinkedList;
import java.util.Queue;

public class Reshape_the_Matrix {
	//Using queue
//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//    	if(nums.length == 0 || r * c != nums.length * nums[0].length){
//    		return nums;
//    	}
//
//    	int[][] res = new int[r][c];
//    	
//    	Queue<Integer> queue = new LinkedList<Integer>();
//    	
//    	for(int i = 0; i < nums.length; i++){
//    		for(int j = 0; j <nums[0].length; j++){
//    			queue.add(nums[i][j]);
//    		}
//    	}
//    	
//    	for(int i = 0; i < r; i++){
//    		for(int j = 0; j < c; j++){
//    			res[i][j] = queue.remove();
//    		}
//    	}
//    	return res;
//    }
	
	
	//Without using extra Space
//	public int[][] matrixReshape(int[][] nums, int r, int c) {
//		if(nums.length == 0 || r * c != nums.length * nums[0].length){
//    		return nums;
//    	}
//
//    	int[][] res = new int[r][c];
//    	int rows = 0, cols = 0;
//    	for(int i = 0; i < nums.length; i++){
//    		for(int j = 0; j < nums[0].length; j++){
//    			cols++;
//    			res[rows][cols] = nums[i][j];
//    			if(cols == c){
//    				rows++;
//    				cols = 0;
//    			}
//    		}
//    	}
//    	return res;
//	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		
		if(nums.length == 0 || r * c != nums.length * nums[0].length){
    		return nums;
    	}

    	int[][] res = new int[r][c];
		int n = nums[0].length;
		for(int i = 0; i < r * c; i++){
			res[i/c][i%c] = nums[i/n][i%n];
		}
		return res;
	}
}
