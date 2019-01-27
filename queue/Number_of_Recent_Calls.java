package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Recent_Calls {

	class RecentCounter {

	    Queue<Integer> q;
	    public RecentCounter() {
	        q = new LinkedList<>();
	    }
	    
	    public int ping(int t) {
	        q.add(t);
	        while(q.peek() < t - 3000){
	            q.poll();
	        }
	        return q.size();
	    }
	}
}
