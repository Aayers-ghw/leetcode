package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_Greater_Element_I {

	//暴力法
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] res = new int[nums1.length];
//        int j;
//        for(int i = 0; i < nums1.length; ++i){
//            for(j = 0; j < nums2.length; ++j){
//                if(nums1[i] == nums2[j]) break;
//            }
//            res[i] = -1;
//            for(; j < nums2.length; ++j){
//                if(nums2[j] > nums1[i]){
//                    res[i] = nums2[j];
//                    break;
//                }
//            }
//        }
//        return res;
//    }
    
    //哈希表和栈
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	int[] res = new int[nums1.length];
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int num : nums2) {
    		while(!stack.empty() && stack.peek() < num) {
    			map.put(stack.peek(), num);
    			stack.pop();
    		}
    		stack.push(num);
    	}
    	for(int i = 0; i < nums1.length; ++i) {
    		res[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
    	}
    	
    	return res;
    	
    }
}
