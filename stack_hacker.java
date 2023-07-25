import java.util.*;
public class stack_hacker {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    while(sc.hasNext()){
	    String s = sc.next();
	    System.out.println(valid(s));

	    }

	}

	public static boolean valid(String s){
	    Stack <Character> st = new Stack<>();
	    int i=0;
	    while(i<s.length()){
	        if(s.charAt(i)=='{'|| s.charAt(i)=='('|| s.charAt(i)=='['){
	            st.push(s.charAt(i));
	        }
	        else{
	            if(st.isEmpty()){
	                return false;
	            }
	            else{
	                if((st.peek()=='{'&& s.charAt(i)=='}')||(st.peek()=='['&& s.charAt(i)==']')|| (st.peek()=='('&& s.charAt(i)==')')){
	                    st.pop();
	                }
	                else{
	                    return false;
	                }
	            }
	        }
	        i++;
	    }
	    return st.isEmpty();
	}
}
