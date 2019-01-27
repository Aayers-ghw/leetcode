package linkedlist;

public class Merge_Two_Sorted_Lists {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 
		 ListNode newNode = new ListNode(0);
		 ListNode firstNode = newNode;
		 
		 while(l1 != null && l2 != null){
			 if(l1.val <= l2.val){
				 newNode.next = l1;
				 l1 = l1.next;
			 }else{
				 newNode.next = l2;
				 l2 = l2.next;
			 }
			 newNode = newNode.next;
		 }
		 
		 while(l1 != null){
			 newNode.next = l1;
			 l1 = l1.next;
			 newNode = newNode.next;
		 }
		 while(l2 != null){
			 newNode.next = l2;
			 l2 = l2.next;
			 newNode = newNode.next;
		 }
		 
		 return firstNode.next;
	 }
	 
	 public static void main(String[] args) {
		 Merge_Two_Sorted_Lists mainTest = new Merge_Two_Sorted_Lists();
		 mainTest.mergeTwoLists(null, null);
	}
}
