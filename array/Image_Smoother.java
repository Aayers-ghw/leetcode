package array;

public class Image_Smoother {
    public int[][] imageSmoother(int[][] M) {
    	int xxx[] = { -1, -1, -1, 0, 1, 1, 1, 0, 0 };
        int yyy[] = { -1, 0, 1, 1, 1, 0, -1, -1, 0 };
        int m = M.length;
        int n = m == 0 ? 0 : M[0].length;
        if(m ==0 && n == 0){
        	return null;
        }
        int[][] res = new int[m][n];
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		int sum = 0;
        		int num = 0;
        		for(int k = 0; k < 9; k++){
        			int x = i + xxx[k];
        			int y = j + yyy[k];
        			if(x >= 0 && x < m && y >= 0 && y < n){
        				sum += M[x][y];
        				num++;
        			}
        		}
        		res[i][j] = sum / num;
        	}
        }
        return res;
    }
}
