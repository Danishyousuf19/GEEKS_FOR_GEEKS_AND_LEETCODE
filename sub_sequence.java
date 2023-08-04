
public class sub_sequence {

	static void sub(String a,String b) {
		if(a.isEmpty()) {
			System.out.println(b);
			return;
		}
		char c=a.charAt(0);
		sub(a.substring(1),b+c);
		sub(a.substring(1),b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sub("abc","");
	}

}
