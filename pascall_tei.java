import java.util.*;

public class pascall_tei {
public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        long prev=1;
        for(int k=1;k<=rowIndex;k++) {
        	long curr=prev*(rowIndex-k+1)/k;
        	list.add((int)curr);
        	prev=curr;
        }
		return list;
    }
}
