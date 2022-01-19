package LLB3;

public class LinkedList {

	class Node {
		int data;
		Node next;// address

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	Node head;// null store kr raha hai

	Node tail;
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
		
		if(head == null) {
			head = nn;
			tail = nn;
			return;
		}
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
