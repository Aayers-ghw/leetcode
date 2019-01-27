package linkedlist;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Palindrome_Linked_List {

	public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
        	slow = slow.next;
        }
        fast = head;
        slow = reverse(slow);
        while(slow != null){
            if(fast.val == slow.val){
                fast = fast.next;
                slow = slow.next;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
