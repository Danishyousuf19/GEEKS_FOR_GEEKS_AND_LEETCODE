import java.util.LinkedList;
import java.util.Queue;

public class boom_number {
	 public static String BoomNumber(long K) {
	       if(K<=0) {
	    	   return "";
	       }
	       Queue <String>a=new LinkedList<>();
	       a.add("2");
	       a.add("3");
	       int c=1;
	       
	       while(c<K) {
	    	   String boom=a.poll();
	    	   c++;
	    	   a.add(boom+"2");
	    	   a.add(boom+"3");
	    	   
	       }
	    return a.poll();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
