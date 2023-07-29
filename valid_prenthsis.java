import java.util.*;

public class valid_prenthsis {
	public boolean isValid(String s) {
		Stack<Character> q = new Stack<>();
		if (s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0) == ')')
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
				q.add(s.charAt(i));
			if (!q.isEmpty()) {
				if (s.charAt(i) == '}' && q.peek() == '{' || s.charAt(i) == ']' && q.peek() == '['
						|| s.charAt(i) == ')' && q.peek() == '(') {
					q.pop();
				} else
					return false;
			} else {
				return false;
			}
		}
		return q.isEmpty();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isValid1("))({}]["));
	}
	public static boolean isValid1(String s) {
		Stack <Character>q=new Stack<>();
		HashMap<Character,Character>map=new HashMap<>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
				q.add(s.charAt(i));
			if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')')
			{
				if(q.isEmpty()||map.get(q.pop())!=s.charAt(i))
					return false;
			}
		}
		return q.isEmpty()
				;
	}

}
