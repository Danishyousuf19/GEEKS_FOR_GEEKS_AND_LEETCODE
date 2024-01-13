
public class sort_linked_lidt {
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	class Solution {
		public static Node insertionSort(Node head)

		{
			Node st = head;
			Node temp = st.next;
			while (temp != null) {
				if (st.data <= temp.data) {
					st = temp;
					temp = temp.next;
				} else {
					st.next = temp.next;
					Node curr = head;
					Node prev = null;
					while (curr.data < temp.data && curr != st) {
						prev = curr;
						curr = curr.next;
					}
					if (prev == null) {
						temp.next = head;
						head = temp;
					} else {
						temp.next = curr;
						prev.next = temp;
					}
				}
				temp = st.next;
			}

			return head;

		}
	}
}
