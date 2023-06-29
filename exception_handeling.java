
public class exception_handeling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class TestClass
{
    // Add your code here. Define private variables, Constructors to initialize 
    // variables with the given values and a method findMin() which prints the 
    // Minimum value of a$b.
	int a;int b;
	TestClass(int a,int b){
		this.a=a;
		this.b=b;
		
	}
public void findMin() {
	int min=Integer.MAX_VALUE;
	try {
		if(a*b<min) min=a*b;
		if(a+b<min) min=a+b;
		if(a/b<min) min=a/b;
		if(a-b<min) min=a-b;
	}
	catch(Exception e) {
		System.out.println(min);
	}
}
		
    
}