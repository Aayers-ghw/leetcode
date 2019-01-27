package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
        	set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
        	if(set1.contains(nums2[i])){
        		set2.add(nums2[i]);
        	}
        }
        int[] res = new int[set2.size()];
        int count = 0;
        for(Integer i : set2){
        	res[count++] = i;
        }
        return res;
    }
}
