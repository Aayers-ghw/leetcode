package linkedlist;

public class Add_Two_Numbers {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode newNode = new ListNode(0);
		ListNode firstNode = newNode;
		
		int tmp = 0;
		
		while(l1 != null || l2 != null || tmp != 0){
			
			int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + tmp;
			tmp = sum / 10;

			ListNode tmpNode = new ListNode(sum % 10);
			newNode.next = tmpNode;
			newNode = newNode.next;
			
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		
		return firstNode.next;
		
		
    }
	
	public static void main(String[] args) {
		Add_Two_Numbers mainTest = new Add_Two_Numbers();
		ListNode l1 = new ListNode(5);
//		l1.next = new ListNode(4);
		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
		ListNode result = mainTest.addTwoNumbers(l1, l2);
		System.out.println(result.val + " " + result.next.val);
//		System.out.println(result.val);
	}
}
