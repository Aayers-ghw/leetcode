package divide_and_conquer;

import java.util.Arrays;
import java.util.PriorityQueue;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Kth_Largest_Element_in_an_Array {
	
//    public int findKthLargest(int[] nums, int k) {
//        int N = nums.length;
//        Arrays.sort(nums);
//        return nums[N - k];
//    }
	
//	public int findKthLargest(int[] nums, int k) {
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		for(int val : nums) {
//			pq.offer(val);
//			
//			if(pq.size() > k) {
//				pq.poll();
//			}
//		}
//		return pq.peek();
//	}
	
	public int findKthLargest(int[] nums, int k) {
		k = nums.length - k;
		int lo = 0;
		int hi = nums.length - 1;
		while(lo < hi) {
			final int index = partition(nums, lo, hi);
			if(index < k) {
				lo = index + 1;
			}else if(index > k) {
				hi = index - 1;
			}else {
				break;
			}
		}
		return nums[k];
	}
	
	private int partition(int[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while(true) {
			while(i < hi && (a[++i] < a[lo]));
			while(j > lo && (a[lo] < a[--j]));
			if(i >= j) {
				break;
			}
			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}
	
    private void swap(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public static void main(String[] args) {
		int res = new Kth_Largest_Element_in_an_Array().findKthLargest(new int[] {3,2,1,5,6,4}, 2);
		System.out.println(res);
	}
}
