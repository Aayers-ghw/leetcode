package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Positions_of_Large_Groups {
    public List<List<Integer>> largeGroupPositions(String S) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	int i = 0;
    	for(int j = 0; j < S.length(); j++){
    		if(j == S.length() - 1 || S.charAt(j) != S.charAt(j + 1)){
    			if(j - i + 1 >= 3){
    				list.add(Arrays.asList(new Integer[]{i, j}));
    			}
    			i = j + 1;
    		}
    	}
    	return list;
    }
}
