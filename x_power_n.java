
public class x_power_n {
	  public double myPow(double x, int n) {
	        long n_copy=n;
	        double sol=Solve(x,Math.abs(n_copy));
	        if(n_copy<0)
	        	return 1/sol;
	        return sol;
	    }
	  static double Solve(double x,long n) {
		  if(n==0)
			  return 1;
		  double temp=Solve(x,n/2);
		  temp=temp*temp;
		  if(n%2==0)
			  return temp;
		  return temp*x;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
