package heap;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_a_Stream {

	private int k;
    private PriorityQueue<Integer> q;
    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;
        for(int num : nums){                
            if(q.size() < k){
                q.offer(num);
            }else if(q.peek() < num){
                q.poll();
                q.offer(num);
            }
        }
    }
    
    public int add(int val) {
        if(q.size() < k){
            q.offer(val);
        }else if(q.peek() < val){
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}
