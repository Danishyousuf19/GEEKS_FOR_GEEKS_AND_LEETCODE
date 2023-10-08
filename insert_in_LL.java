
public class insert_in_LL {
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node sortedInsert(Node head1, int key) {
		Node head = new Node(key);

		if (head1 == null || key < head1.data) {
			head.next = head1;
			return head;
		}
		Node temp = head1;
		while (temp.next != null && temp.next.data < key) {
			temp = temp.next;
		}

		head.next = temp.next;
		temp.next = head;
		return head1;

	}
}
