
public class merge_sorted_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 class ListNode {
     int val;
    ListNode next;
  ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solutwion12 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode x=new ListNode(0);
        ListNode curr=x;
        while(list1!=null&&list2!=null) {
        	if(list1.val<=list2.val) {
        		curr.next=list1;
        		list1=list1.next;
        	}
        	else {
        		curr.next=list2;
        		list2=list2.next;
        		
        	}
        	curr=curr.next;
        	
        	
        }
        curr.next=list1!=null?list1:list2;
        
        return x.next;
        
    }
}