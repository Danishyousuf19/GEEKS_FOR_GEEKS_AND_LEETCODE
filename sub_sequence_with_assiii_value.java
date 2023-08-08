
public class sub_sequence_with_assiii_value
{
	static void sub(String a,String b) {
		if(a.isEmpty()) {
			System.out.println(b);
			return;
		}
		char c=a.charAt(0);
		sub(a.substring(1),b+c);
		sub(a.substring(1),b);
		sub(a.substring(1),b+(c+0));
	}
}
