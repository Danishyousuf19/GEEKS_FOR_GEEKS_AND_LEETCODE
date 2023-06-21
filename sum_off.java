
public class sum_off {
	static int sumOfNaturals(int n) {
		
	       long temp=(((long)(n)*(long)(n+1)%1000000007)/2)%1000000007;
	      return (int)(temp);
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
System.out.println(sumOfNaturals(44721));
	}
}
