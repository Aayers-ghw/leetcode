package linkedlist;

public class Design_Linked_List {

}

class MyLinkedList {

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	private int size;
	private Node head;

	/** Initialize your data structure here. */
	public MyLinkedList() {

	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		if (index >= size)
			return -1;
		Node p = head;
		for (int i = 0; i < index; ++i) {
			p = p.next;
		}
		return p.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {

		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;

		// Node newNode = head;
		// head = new Node(val);
		// head.next = newNode;

		size++;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node prev = head;
			while (prev.next != null) {
				prev = prev.next;
			}
			newNode.next = prev.next;
			prev.next = newNode;
		}

		size++;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index > size)
			return;
		if (index == 0) {
			addAtHead(val);
		} else {
			Node prev = head;
			for (int i = 0; i < index - 1; ++i) {
				prev = prev.next;
			}
			Node newNode = new Node(val);
			newNode.next = prev.next;
			prev.next = newNode;
			size++;
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index >= size)
			return;
		Node prev = head;
		for (int i = 0; i < index - 1; ++i) {
			prev = prev.next;
		}
		prev.next = prev.next.next;
		size--;
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */