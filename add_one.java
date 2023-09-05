
public class add_one {
	 public int[] plusOne(int[] d) {
		 for(int i=d.length-1;i>=0;i--) {
			 if(d[i]==9) {
				 d[i]=0;
			 }
			 else {
				 d[i]++;
				 return d;
			 }
		 }
		 int nd[]=new int [d.length+1];
		 nd[0]=1;
		return nd;
	        
	    }
}
