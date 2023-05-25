import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PLAY_with_character_CLASS{
	static String toLower(String S) {
		String ff= S.toLowerCase();
        return ff ;
      }
	static String isVowel(char c){
		String d="";
		d+=c;
        if(d.matches("[aeiouAEIOU]")) {
        	return "YES";
        	
        }
        
       return "NO";
    }
	
	
	 static String removeVowels(String S) {
	        // code here
	        return S.replaceAll("[aeiouAEIOU]", "");
	    }
	 static void split_string(String text) {
		 String[] fruits = text.split(",\\s"); // Splits the string at commas, removing any surrounding whitespace
			for (String fruit : fruits) {
			    System.out.println(fruit);}
	 }
	public static void main(String[] args) {
		System.out.println(removeVowels("rqwef3434rr3fdeewrfEW3EED"));
		String text = "Apple, Banana, Chserry, Date";
		split_string(text);
		String e5=toLower("deDgjotoSFsd");
	System.out.println(e5);
	System.out.println(isVowel('e'));
	}
	
     
//	 String text = "The quick brown fox jumps over the lazy dog";
//     Pattern pattern = Pattern.compile("\\b[a-zA-Z]{5}\\b"); // Matches words with exactly 5 alphabetic characters
//     Matcher matcher = pattern.matcher(text);{
//     while (matcher.find()) {
//         System.out.println(matcher.group()); }
//}
     
	/* Output:
	quick
	brown
	jumps
	*/
    

     
}
