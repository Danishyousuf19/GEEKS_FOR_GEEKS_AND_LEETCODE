import java.util.ArrayList;

public class rempove_dublicate_of_str{
	   
	String removeDuplicates(String str) {
		ArrayList<Character>a=new ArrayList<>();
		String s="";
		for(int i=0;i<str.length();i++) {
			if(!a.contains(str.charAt(i))) {
				a.add(str.charAt(i));
				s+=str.charAt(i);
			}
		}
			return s;	
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
