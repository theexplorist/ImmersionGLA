package LLB3;

import java.util.HashSet;
import java.util.Set;

public class LinkedListLeetcode {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode h1, ListNode h2) {

		if (h1 == null) {
			return h2;
		}

		if (h2 == null) {
			return h1;
		}
		ListNode h3 = new ListNode();// dummy node
		ListNode p1 = h1;
		ListNode p2 = h2;
		ListNode p3 = h3;// dummy node

//         //if(h3 == null)

//         if(p1.val < p2.val) {
//             h3 = p1;
//             p3 = p1;
//             p1 = p1.next;
//         } else {
//             h3 = p2;
//             p3 = p2;
//             p2 = p2.next;
//         }

		// jb dono hi bach rahi hain
		while (p1 != null && p2 != null) {

			if (p1.val < p2.val) {
				p3.next = p1;
				p1 = p1.next;
			} else {
				p3.next = p2;
				p2 = p2.next;
			}

			p3 = p3.next;
		}

		// jb sirf p1 bach rahi hai
		while (p1 != null) {
			p3.next = p1;
			p1 = p1.next;
			p3 = p3.next;
		}

		// jb sirf p2 bach rahi hai
		while (p2 != null) {
			p3.next = p2;
			p2 = p2.next;
			p3 = p3.next;
		}

		h3 = h3.next;
		return h3;
	}

	public void deleteNode(ListNode curr) {
		ListNode currN = curr.next;

		curr.val = currN.val;

		curr.next = currN.next;
	}

	public ListNode middleNode(ListNode head) {
		ListNode s = head;
		ListNode f = head;

		while (f != null && f.next != null) {
			s = s.next;
			f = f.next.next;
		}

		return s;
	}

	public ListNode detectCycle(ListNode head) {
		Set<ListNode> vis = new HashSet<>();
		ListNode curr = head;

		while (curr != null) {

			if (vis.contains(curr)) {
				return curr;
			}

			vis.add(curr);
			curr = curr.next;
		}

		return null;
	}

	public boolean hasCycle(ListNode head) {

		ListNode s = head;
		ListNode f = head;

		while (f != null && f.next != null) {
			s = s.next;
			f = f.next.next;// f.next, f == null => npe //f.next.next, f.next = null => npe

			if (s == f) {
				return true;
			}
		}

		return false;
	}

	public boolean hasCycleExtraSpace(ListNode head) {

		Set<ListNode> vis = new HashSet<>();
		ListNode curr = head;

		while (curr != null) {

			if (vis.contains(curr)) {
				return true;
			}

			vis.add(curr);
			curr = curr.next;
		}

		return false;
	}
}
