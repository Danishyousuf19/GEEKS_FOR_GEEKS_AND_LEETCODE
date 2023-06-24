
public class prefix_match {
	 public int klengthpref(String[] a, int n, int k, String s)
	    {
	        if(s.length()<k)return 0;
	        String x=s.substring(0,k);
	        int c=0;
	        for(int i=0;i<n;i++) {
	        	if(a[i].length()<k)continue;
	        	String d=a[i].substring(0,k);
	        	if(x.equals(d))c++;
	        }return c;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
