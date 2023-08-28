
public class cycle_list {
	public class Solution {
		
		class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) {
		        val = x;
		        next = null;
		    }
		}
	    public boolean hasCycle(ListNode head) {
	    	 ListNode slow=head;
		    	ListNode fast=head;
		    	while(slow.next!=null&&fast.next!=null) {
		    	
		    		slow=slow.next;
		    		fast=fast.next.next;
							if(slow.val==fast.val)return true;
		    	}
		    	
				return false;  
	    }
	        
	    }
	}

}
