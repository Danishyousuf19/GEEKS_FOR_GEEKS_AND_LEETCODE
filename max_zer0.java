
public class max_zer0 {
	 String MaxZero(String a[], int n)
	    {
	 int max=0;
	        String ans="";
	        for(int i=0;i<n;i++) {
	        	String  c=a[i];
	        	int o=0;
	        	for(int j=0;j<c.length();j++) {
	        		if(c.charAt(i)=='0') {
	        			o++;
	        		}
	        		if(o>max) {
	        			max=o;
	        			ans=a[i];
	        		}
	        	}
	        }
	        return ans;
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
