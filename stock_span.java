import java.util.Stack;

public class stock_span {
	public static int[] calculateSpan(int price[], int n)
    {
        int ans[]=new int[n];
        Stack <Integer>NoOfDay=new Stack<>();
        for (int i=0;i<n;i++) {
        	while(!NoOfDay.isEmpty()&&price[NoOfDay.peek()]<=price[i]) {
        		NoOfDay.pop();
        	}
        	if(NoOfDay.isEmpty()) {
        		ans[i]=i+1;
        	}
        	else {
        		ans[i]=i-NoOfDay.peek();
        	}
        	NoOfDay.push(i);
        }
        
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
