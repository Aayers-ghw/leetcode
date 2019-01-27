package bsearch;

public class Sqrt_x {

	public int mySqrt(int x) {
        if(x <= 0) return 0;
        int low = 1;
        int hight = x;
        while(low <= hight){
            int mid = low +  ((hight - low) / 2);
            if(mid <= x / mid && (mid + 1) > x / (mid + 1)){
                return mid;
            }else if(mid > x / mid){
                hight = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
