
public class baloon_problem {
	 public int maxInstance(String s) {
		 int b=0,a=0,l=0,o=0,n=0;
	        for(int i=0;i<s.length();i++) {
	        	char c=s.charAt(i);
	        	if(c=='b')
	        		b++;
	        	else if(c=='a')
        		    a++;
	        	else if(c=='l')
	        		l++;
	        	else if(c=='o')
	        		o++;
	        	else if(c=='n')
	        		n++;
	        }
	        int single=Math.min(b, Math.min(n,a));
	        int doublle=Math.min(o, l);
	        doublle/=2;
	        return Math.min(single, doublle);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
