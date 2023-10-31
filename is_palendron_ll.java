
public class is_palendron_ll {
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	class Solution
	{
	    //Function to check whether the list is palindrome.
		boolean isPalindrome(Node head) {
		    if (head == null) {
		        return true;
		    }

		    // Find the middle of the linked list using slow and fast pointers
		    Node slow = head;
		    Node fast = head;
		    while (fast != null && fast.next != null) {
		        slow = slow.next;
		        fast = fast.next.next;
		    }

		    // Reverse the second half of the linked list
		    Node secondHalf = reverse(slow);

		    // Compare the first and reversed second halves
		    Node firstHalf = head;
		    while (secondHalf != null) {
		        if (firstHalf.data != secondHalf.data) {
		            return false;
		        }
		        firstHalf = firstHalf.next;
		        secondHalf = secondHalf.next;
		    }

		    return true;
		}

		private Node reverse(Node head) {
		    Node prev = null;
		    Node current = head;
		    while (current != null) {
		        Node next = current.next;
		        current.next = prev;
		        prev = current;
		        current = next;
		    }
		    return prev;
		}
	    
	    }
}
