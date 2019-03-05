package bsearch;

public class Guess_Number_Higher_or_Lower {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        while(left <= right){
            int mid = left + ((right - left) >> 1);
            int val = guess(mid);
            if(val == 0){
                return mid;
            }else if(val == 1){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
