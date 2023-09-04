import java.util.Stack;

public class mini_to_make_valid_parenthess {
	 public int minAddToMakeValid(String s) {
	        Stack <Character>st=new Stack();
	       for(char c:s.toCharArray()) {
	    	   if(!st.isEmpty()&&c==')') {
	    		   if(st.peek()=='(') {
	    			   st.pop();
	    		   }
	    		   else {
	    			   st.push(c);
	    		   }
	    	   }
	    	   else {
	    		   st.push(c);
	    	   }
	       }
	        return st.size();
	    }
}
