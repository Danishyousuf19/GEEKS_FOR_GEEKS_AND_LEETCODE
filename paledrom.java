
public class paledrom {
	 static  int chkPalindrome(String S) {
		 int e=S.length()-1;
		 int s=0;
		 while(s<e) {
			 if(S.charAt(e)!=S.charAt(s))return 0;
			 s++;
			 e--;
		 }
	     return 1;
	    }

public static boolean isPalindrome(String s) {
	s=s.toLowerCase();
   StringBuilder sb=new StringBuilder();
   for(int i=0;i<s.length();i++) {
	   if(Character.isDigit(s.charAt(i))) {
		   sb.append(s.charAt(i));
	   }
	   if(Character.isAlphabetic(s.charAt(i))) {
		   sb.append(s.charAt(i));
	   }
	  
   }
   System.out.println(sb.toString());
   return chkPalindrome(sb.toString())==1;
}
public static void main(String h) {
	isPalindrome("");
}
public boolean isPalin(String s) {
    // Preprocess the input string
    s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
    
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;

}
}