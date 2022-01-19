package LLB4;

public class LinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	Node head;// null pr initially
	Node tail;

	private void display() {
		// TODO Auto-generated method stub

		Node i = head;

		while (i != null) {
			System.out.print(i.data + "->");
			i = i.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private void addAtLast(int val) {
		// TODO Auto-generated method stub

		Node nn = new Node(val);
		if(head == null) {
			head = nn;
			tail = nn;
			return;
		}
//		if (head == null) {
//			head = nn;
//			return;
//		}
//		Node lastN = head;
//		while (lastN.next != null) {
//			lastN = lastN.next;
//		}
//		lastN.next = nn;
		tail.next = nn;
		tail = nn;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.addAtLast(10);
		ll.addAtLast(20);
		ll.addAtLast(30);
		ll.addAtLast(40);
		ll.addAtLast(50);
		
		ll.display();
	}
}
