import java.util.ArrayList;
import java.util.Stack;

public class is_valid_str {
	boolean valid(String s) 
    { 
		Stack <Character>a=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			//first;
			if(c=='('||c=='{'||c=='[') {
				a.push(c);
			}
			else {
				if(a.isEmpty()) {
					return false;
				}
				else if((c==')'&&a.peek()=='(')||
						(c=='}'&&a.peek()=='{')||
						(c==']'&&a.peek()=='[')){
					a.pop();
				}
				else {
					return false;
				}
			}
			
		}
		if (a.isEmpty()) {
			return true;
		}
		
		
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(Character.isDigit('3'));
	}

}
