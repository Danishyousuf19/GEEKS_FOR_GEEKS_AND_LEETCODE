
public class add_two_no {
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
	/**
	 * Definition for singly-linked list.

	 */
	class Solution {
	   	ListNode curr = null;
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			
			int carry = 0;
			while (l1 != null||l2 != null||carry!=0) {
				int sum = 0;
				if (l1 != null) {
					sum += l1.val;
				}
				if (l2 != null) {
					sum += l2.val;
				}
				sum+=carry;
	if(sum>=10) {
		carry=sum/10;
		sum%=10;
	}
	else {
	            carry = 0;
	        }
	ListNode temp=new ListNode(sum);
	if(curr==null) {
		curr=temp;
		
	}

	else {
		ListNode c=curr;
		while(c.next!=null) {
			c=c.next;
		}
		c.next=temp;
	}
	if(l1!=null)l1 =l1.next;
	if(l2!=null)l2=l2.next;

			}
			return curr;

		} 
	}
}
