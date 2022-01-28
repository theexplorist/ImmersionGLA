package LLB3;

public class LinkedList {

	private class Node {
		int data;
		Node next;// address

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	private Node head;// null store kr raha hai

	private Node tail;

	private int size;// 0

	private void display() {
		// TODO Auto-generated method stub

		Node i = head;
		while (i != null) {
			System.out.print(i.data + "->");
			i = i.next;
		}

		System.out.println();
	}

	private void addAtLast(int val) {
		// TODO Auto-generated method stub

		Node nn = new Node(val);
		size++;
//		if(head == null) {
//			head = nn;
//			return;
//		}
//		
//		Node lastN = head;
//		
//		while(lastN.next != null) {
//			lastN = lastN.next;
//		}
//		lastN.next = nn;

		if (head == null) {
			head = nn;
			tail = nn;
			return;
		}
		tail.next = nn;
		tail = nn;
	}

	private void addAtFirst(int val) {
		// TODO Auto-generated method stub

		Node nn = new Node(val);
		size++;
		if (head == null) {
			head = nn;
			tail = nn;
			return;
		}

		nn.next = head;
		head = nn;

	}

	private void addAtIndex(int val, int idx) throws Exception {// size = 5 //(35, 6)
		// TODO Auto-generated method stub

		if (idx == 0) {
			addAtFirst(val);
			return;
		} else if (idx == this.size()) {
			addAtLast(val);
			return;
		} else {
			Node nn = new Node(val);
			// idx, idx - 1
			Node idx_1 = getNodeAt(idx - 1);
			Node curr = idx_1.next;

			idx_1.next = nn;
			nn.next = curr;
			size++;
		}
	}

	private int getValueAt(int idx) throws Exception {
		// TODO Auto-generated method stub

		return getNodeAt(idx).data;// node.data
	}

	private Node getNodeAt(int idx) throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("Linked List Khaali Hai!");
			// return null;
		}

		if (idx < 0 || idx > this.size() - 1) {
			throw new Exception("Galat Index!");
		}
		Node i = head;
		for (int ct = 1; ct <= idx; ct++) {
			i = i.next;
		}

		return i;
	}

	private int size() {
		// TODO Auto-generated method stub

//		if(head == null) {
//			return 0;
//		}
//		Node i = head;
//		int ct = 1;
//		while(i != null) {
//			i = i.next;
//			ct++;
//		}
//		
//		return ct;

		return size;// O(1)
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub

		return size == 0;
	}

	private void removeFirst() throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("Linked List Khaali Hai!");
		}

		size--;
		if (this.size == 1) {
			head = null;
			tail = null;
			return;
		}
		// Kaam chalau removal
//		head = head.next;

		// actual removal

		Node hNext = head.next;
		head.next = null;
		head = hNext;
	}

	private void removeLast() throws Exception {// size - 1 waali node remove
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("Linked List Khaali Hai!");
		}

		if (this.size() == 1) {
			removeFirst();
			return;
		} else {
			Node secondL = getNodeAt(size - 2);

			secondL.next = null;
			tail = secondL;
			size--;
		}
	}

	private void removeAtIndex(int idx) throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("Linked List Khaali Hai!");
		}

		if (idx == this.size()) {
			throw new Exception("Galat Index!");
		}

		if (idx == 0) {
			removeFirst();
		} else if (idx == size - 1) {
			removeLast();
		} else {
			Node idx_1 = getNodeAt(idx - 1);
			Node idxPlus1 = idx_1.next.next;
			idx_1.next = idxPlus1;
			size--;
		}

	}

	private void reverseList() {
		// TODO Auto-generated method stub

		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			Node cNext = curr.next;
			curr.next = prev;
			prev = curr;
			curr = cNext;
		}
		
		
		Node temp = head;
		head = tail;
		tail = temp;
	}
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addAtLast(10);
		ll.addAtLast(20);
		ll.addAtLast(30);
		ll.addAtLast(40);
		ll.addAtLast(50);
		ll.display();
//		ll.addAtFirst(60);
//		ll.addAtFirst(50);
//		ll.addAtFirst(40);
//		ll.addAtFirst(30);
		// ll.getNodeAt(ll.size());
		// ll.display();
		// System.out.println();
		// System.out.println(ll.size());
		// ll.addAtIndex(35, 3);
		ll.reverseList();
		//ll.removeAtIndex(0);
		ll.display();
		System.out.println(ll.size());
	}
}
