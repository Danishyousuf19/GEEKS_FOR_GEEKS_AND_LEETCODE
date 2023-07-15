import java.util.Stack;

public class delete_middle_of_stack {
	public void deleteMid(Stack<Integer>s,int sizeOfStack){
		int mid=sizeOfStack/2;
		helper(s,mid);
		    }
	static void helper(Stack <Integer>a,int mid)
	{
		if(mid==0) {
			a.pop();
			return;
		}
		int save=a.pop();
		helper(a,mid-1);
		a.push(save);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
