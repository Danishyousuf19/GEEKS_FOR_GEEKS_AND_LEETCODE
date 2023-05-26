
public class Evenly_Divide {
	static int evenlyDivides(int N){
	       int c=0;int dive=N;
	       for (;N>0;N/=10) {
	    	   int div=N%10;
	    	   if(div==0) {
	    		   continue;
	    	   }
	    	   if(dive%div==0) {
	    		   c++;
	    	   }
	       }
	       return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(evenlyDivides(30));
	}}
