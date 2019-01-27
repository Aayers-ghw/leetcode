package sort;

import java.util.Arrays;

public class K_Closest_Points_to_Origin {

	public int[][] kClosest(int[][] points, int K) {
        if(points.length == 0) return null;
        int[] list = new int[points.length];
        int[][] ans = new int[K][2];
        for(int i = 0; i < points.length; ++i){
            list[i] = juli(points[i][0], points[i][1]);
        }
        Arrays.sort(list);
        int temp = list[K - 1];
        int t = 0;
        for(int i = 0; i < points.length; ++i){
            if(juli(points[i][0], points[i][1]) <= temp){
            	System.out.println(points[i][0] + " " +points[i][1]);
                ans[t++] = points[i];
            }
        }
        return ans;
    }
    public int juli(int x, int y){
        return x * x + y * y;
    }
    public static void main(String[] args) {
		new K_Closest_Points_to_Origin().kClosest(new int[][] {{1,3}, {-2, 2}}, 1);
	}
}
