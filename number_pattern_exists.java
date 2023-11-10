import java.util.Stack;

public class number_pattern_exists {
	 static String printMinNumberForPattern(String S){
	        // code here
			String r="";
			Stack<Integer>st=new Stack<>();
			int i=0;
			for(;i<S.length();i++) {
				st.push(i+1);
				if(i==S.length()||S.charAt(i)=='I') {
					while(!st.isEmpty()) {
						r+=st.pop();
						
					}
				}
			}
			st.push((i+1));
			while(!st.isEmpty()) {
				r+=st.pop();
			}
			return r;
	    
	}
}
