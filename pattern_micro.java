import java.util.ArrayList;
import java.util.List;

public class pattern_micro {
	 ArrayList<Integer> a = new ArrayList<>();
	    public void patMinus(int n){
	        if(n <= 0)
	            return;
	        a.add(n-5);
	        patMinus(n-5);
	    }
	    public void patPlus(int val, int n){
	        if(n == val)
	            return;
	        a.add(val+5);
	        patPlus(val+5, n);
	    }
	    public List<Integer> pattern(int N){
	        // code here
	        a.add(N);
	        patMinus(N);
	        patPlus(a.get(a.size()-1), N);
	        return a;
	    }
}
