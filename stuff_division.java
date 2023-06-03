
public class stuff_division {
	  public boolean possible(long arr[], long n) 
	  {
	      long sum =0;
	    {for(long e:arr) {
	    	sum+=e;
	    }
	    } return (sum==n*(n+1)/2); 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Your are given N students with some goodies to be distrubuted among
//them such that student at ith index gets exactly i amount of goodies 
//(considering no wastage). The goodies has already been distributed by some 
//other. Your task is to check if it can be redistributed such that student at ith index gets i amount of goodies.
//
//
//Example 1:

