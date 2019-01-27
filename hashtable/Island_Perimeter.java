package hashtable;

public class Island_Perimeter {

//    public int islandPerimeter(int[][] grid) {
//        int n = grid.length;
//        int m = grid[0].length;
//        int res = 0;
//        for(int i = 0; i < n; i++) {
//        	for(int j = 0; j < m; j++) {
//        		if(grid[i][j] == 1) {
//        			if(i == 0 || grid[i - 1][j] == 0)	res++;
//            		if(i == n - 1 || grid[i + 1][j] == 0)	res++;
//            		if(j == 0 || grid[i][j - 1] == 0)	res++;
//            		if(j == m -1 || grid[i][j + 1] == 0)	res++;
//        		}
//        	}
//        }
//        return res;
//    }
	
	public int islandPerimeter(int[][] grid) {
		int islands = 0, neighbours = 0;
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					islands++;
					if(j < grid[i].length - 1 && grid[i][j + 1] == 1)	neighbours++;
					if(i < grid.length - 1 && grid[i + 1][j] == 1)	neighbours++;
				}
			}
		}
		return islands * 4 - 2 * neighbours;
	}
}
