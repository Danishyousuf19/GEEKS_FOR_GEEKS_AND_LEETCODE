
public class mean {

	 static int mean(int N , int[] A) {
	      int sum=0;
	      for (int a:A) {
	    	  sum+=a;
	      }
	      return (int )sum/N;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {2,2,2,2};
System.out.println(mean(4,s));
	}

}
