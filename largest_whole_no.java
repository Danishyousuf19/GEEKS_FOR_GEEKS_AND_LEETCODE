import java.util.Arrays;
import java.util.Collections;

public class largest_whole_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ar[] = {1, 6, 2, 4, 0, 5};
		Arrays.sort(ar,Collections.reverseOrder());
		StringBuilder sb=new StringBuilder();
		for(int i: ar) {
			sb.append(i);
		}
		System.out.println(sb.toString());
		
	}

}
