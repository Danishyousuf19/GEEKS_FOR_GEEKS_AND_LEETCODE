
public class skip_word {
//	skip word apple;
static String skip(String s) {
	if(s.isEmpty()) return "";
	if(s.startsWith("apple")) return skip(s.substring(5));
	else return s.charAt(0)+skip(s.substring(1));
		
}
//skip word app if it is not apple
static String skip_no(String s) {
	if(s.isEmpty()) return "";
	if(!s.startsWith("apple")&&s.startsWith("app")) return skip_no(s.substring(3));
	else return s.charAt(0)+skip_no(s.substring(1));
		
}
}
