package array;

public class Maximize_Distance_to_Closest_Person {
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int  i, j;
        for(i = 0, j = 0; j < seats.length; ++j){
        	if(seats[j] == 1){
        		if(i == 0){
        			res = Math.max(res, j - i);
        		}else{
            		res =  Math.max(res, j - i + 1);
        		}
        		i = j + 1;
        	}
        }
        res = Math.max(res, seats.length - i);
        return res;
    }
}
