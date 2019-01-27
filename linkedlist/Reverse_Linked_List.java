package linkedlist;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Reverse_Linked_List {

	//µü´ú
//	public ListNode reverseList(ListNode head) {
//        ListNode curr = head;
//        ListNode prev = null;
//        while(curr != null){
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }
	
	//µÝ¹é
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)	return head;
		ListNode second = head.next;
		ListNode reverseHead = reverseList(second);
		second.next = head;
		head.next = null;
		
		return reverseHead;
	}
}
