package linkedlist;

public class Swap_Nodes_in_Pairs {

	public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
}
