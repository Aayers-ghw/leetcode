package linkedlist;

public class Reverse_Linked_List_II {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i < m - 1; ++i){
            pre = pre.next;
        }
        ListNode curr = pre.next;
        for(int i = 0; i < n - m; ++i){
            ListNode t = curr.next;
            curr.next = t.next;
            t.next = pre.next;
            pre.next = t;
        }
        return dummy.next;
    }
}
