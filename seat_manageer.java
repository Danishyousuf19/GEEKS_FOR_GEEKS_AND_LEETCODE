import java.util.PriorityQueue;

public class seat_manageer {
	class SeatManager {
int last;
PriorityQueue<Integer>unreserved;
	    public SeatManager(int n) {
	        this.last=0;
	        this.unreserved=new PriorityQueue<>();
	    }
	    
	    public int reserve() {
	        if(unreserved.isEmpty())
	        	return++last;
	        else 
			return unreserved.poll();
	    }
	    
	    public void unreserve(int sn) {
	        if(sn==last)
	        	--last;
	        else  unreserved.offer(sn);
	    }
	}

}
