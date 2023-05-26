interface v{
	default void cc() {
		System.out.println();return ;
	}
}
class a implements v{
	static int a=40;static int b=9;
	public  void cc(){
		return ;
		
	}
}
class b extends a{
	static {
		
		System.out.println(a+" "+b);
	}
	void m() {
		System.out.println(a);
	}
	
}
public class replace_0_to_5 {
//	static int convertfive(int num) {
//	       String f=Integer.toString(num);
//	       f=f.replace("0", "5");
//	       num=Integer.parseInt(f);
//	       return num;
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(convertfive(200303));
b c=new b();
c.m();
	}

}
