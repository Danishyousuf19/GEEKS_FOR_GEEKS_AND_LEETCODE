import java.util.ArrayList;

public class patern_of_string {
	 static ArrayList<String> pattern(String S) {
	       ArrayList<String>list=new ArrayList<>();
	     for(int i=S.length()-1;i>=0;i--) {
	    	 String s=S.substring(0,i+1);
	    	 list.add(s);
	     }
	       return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> l=pattern("geek");
for(String e:l) {
	System.out.println(e);
}
	}
	

}
//"GeeK"
//Output: Geek
//        Gee
//        Ge
//        g