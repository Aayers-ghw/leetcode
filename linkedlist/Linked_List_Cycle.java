package linkedlist;

import java.util.HashSet;
import java.util.Set;

//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//		next = null;
//	}
//}

public class Linked_List_Cycle {

	public boolean hasCycle(ListNode head) {

		Set<ListNode> set = new HashSet<ListNode>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
	}
}
