
public class check_binary {

	static boolean isBinary(String str)
	{
	  for (int i=0;i<str.length();i++){
	      char c=str.charAt(i);
	      if((c!='1')&(c!='0'))
	      return false;
	  }return true;
	}
	public static void main (String a[]) {
	System.out.println(isBinary("0111100110101100"));	
	}
}
