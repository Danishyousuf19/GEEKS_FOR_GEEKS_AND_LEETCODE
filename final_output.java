
public class final_output {
	 public int finalValueAfterOperations(String[] o) {
		 int x=0;
	        for(int i=0;i<o.length;i++ ) {
	        	char f=o[i].charAt(0);
	        	char s=o[i].charAt(1);
	        	if(f!='X') {
	        		if(s=='+') {
	        			x=x+1;
	        		}
	        		else {
	        			x=x-1;
	        		}
	        	}
	        	else {
	        		if(s=='+') {
	        			x=x+1;
	        		}
	        		else {
	        			x=x-1;
	        		}
	        	}
	        }
	        return x;
	    }
}
