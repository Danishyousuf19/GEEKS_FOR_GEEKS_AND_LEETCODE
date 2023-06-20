import java.util.LinkedList;
import java.util.Queue;

public class jumping_number {
	static long jumpingNums(long X) {
	       Queue<Long> q = new LinkedList<>();
	        for(long i=1;i<=9;i++)   q.add(i);
	        
	        long ans = 0;
	        while(!q.isEmpty()){
	            long num = q.remove();
	            if(num > X) continue;
	            ans = Math.max(ans , num);
	            int l = (int) num%10;
	            if(l!=0){
	                long f = num*10+(l-1);
	                q.add(f);
	            }
	            if(l!=9){
	                long s = num*10+(l+1);
	                q.add(s);
	            }
	        }
	        return ans;
	    
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
