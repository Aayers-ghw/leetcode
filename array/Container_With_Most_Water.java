package array;

public class Container_With_Most_Water {
	
//    public int maxArea(int[] height) {
//    	int res = 0;
//        for(int i = 0; i < height.length; i++){
//        	for(int j = 1; j < height.length; j++){
//        		res = Math.max(res, Math.min(height[j], height[i]) * (j - i));
//        	}
//        }
//        return res;
//    }
	
	public int maxArea(int[] height) {
		int i = 0, j = height.length - 1;
		int res = 0;
		while(i < j){
			res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
			if(height[i] > height[j]){
				j--;
			}else{
				i++;
			}
		}
		res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
		return res;
	}
}
