import java.util.HashSet;

public class union_of_array {
	 public static int doUnion(int a[], int n, int b[], int m) 
	    {
	        HashSet<Integer> set=new HashSet<>();
	        int j=0;
	        for(int i=0;i<(m+n);i++) {
	        	if (i<n)set.add(a[i]);
	        	if(j<m) {set.add(b[j]);
	        	j++;}
	        }
	        return set.size();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
