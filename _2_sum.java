import java.util.HashSet;
import java.util.Set;

public class _2_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,3,4,5,34,3,2,2};
		int t=6;
		Set<Integer>set=new HashSet<>();
		for(int i:ar) {
			set.add(i);
		}
		for(int i:ar) {
			int c=t-i;
			if(set.contains(c)) {
				System.out.println(i+" "+c);
			}
		}

	}

}
