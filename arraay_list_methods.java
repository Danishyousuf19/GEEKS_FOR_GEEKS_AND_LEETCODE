import java.util.*;

public class arraay_list_methods {
	  public static void insert(ArrayList<Character> clist, char c)
	    {
	        clist.add(c);
	        
	    }
	    
	    // Function to count frequency of element
	    public static void freq(ArrayList<Character> clist, char c)
	    {
	     
	        if(clist.contains(c))
	        System.out.println(Collections.frequency(clist,c));
	        else
	        System.out.println("Not Present");
	        
	    }
}
