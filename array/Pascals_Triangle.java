package array;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		
		for(int i = 0; i < numRows; i++){
			List<Integer> row = new ArrayList<Integer>();
			
			for(int j = 0; j < i + 1; j++){
				if(j == 0 || j == i){
					row.add(1);
				}else{
					int a = allrows.get(i - 1).get(j - 1);
					int b = allrows.get(i - 1).get(j);
					row.add(a + b);
				}
			}
			allrows.add(row);
		}
		
		return allrows;
	    }
}
