
public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int a=10;
		        int b=20;
		        int diff=a-b;
		        int greater=a-((diff>>31)&1)*diff;
		        System.out.println("greater is "+greater);
		    
		
	}

}
