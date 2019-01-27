package linkedlist;

//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//	}
//}
public class Remove_Nth_Node_From_End_of_List {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        int i = 1;
        while(fast != null && i < n){
            fast = fast.next;
            i++;
        }
        if(fast == null) return head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev == null){
            head = head.next;
        }else{
            prev.next = prev.next.next;
        }
        return head;
    }
}
