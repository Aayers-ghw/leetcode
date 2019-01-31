package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Find_Median_from_Data_Stream {

	class MedianFinder {

	    /** initialize your data structure here. */
	    public MedianFinder() {
	        
	    }
	    
	    private Queue<Integer> small = new PriorityQueue(new Comparator<Integer>() {
	                    public int compare(Integer i1, Integer i2) {
	                        return i2 - i1;
	                    }
	                });
	    private Queue<Integer> large = new PriorityQueue(new Comparator<Integer>() {
	                public int compare(Integer i1, Integer i2) {
	                    return i1 - i2;
	                }
	            });
	    
	    public void addNum(int num) {
	        //small.size >= large.size
	        if(small.isEmpty() || num <= small.peek()){
	            small.add(num);
	        }else{
	            large.add(num);
	        }
	        
	        //Balance left/right
	        if(small.size() < large.size()){
	            small.add(large.poll());
	        }else if(small.size() - large.size() == 2){
	            large.add(small.poll());
	        }
	    }
	    
	    public double findMedian() {
	        if(small.size() > large.size()){
	            return small.peek();
	        }else{
	            return (small.peek() + large.peek()) / 2.0;
	        }
	    }
	}

}
