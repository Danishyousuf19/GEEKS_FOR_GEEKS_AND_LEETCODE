import java.util.*;

//User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer>s=new Stack<>();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        st.push(x);
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        return st;
    }
}
public class stpush {

}
