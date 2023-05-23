//Given a string, check if all its characters are the same or not.
//
//Example 1:
//
//Input:
//s = "geeks"
//Output: False
//Explanation: The string contains different
//character 'g', 'e', 'k' and 's'.
//
//Example 2:
//
//Input: 
//s = "gggg"
//Output: True
//Explanation: The string contains only one
//character 'g'.

//\ Your task is to complete the function check() 
//which takes a string as input and returns True if all the characters 
//in the string are the same. Else, it returns False.


public class check_string {
	static boolean check (String s)
    {
               for (int i=0;i<s.length();i++) {
            	   
            		    if(s.charAt(0)!=s.charAt(i)) {
            		    return false;	
            		    }
               }return true;
    }

	public static void main(String[] args) {
		
System.out.println(check("gggg"));
	}

}
