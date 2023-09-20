import java.util.ArrayList;

public class rotate_binary {
	   ArrayList<Integer> rotate(int N, int d)
	    {d%=16;
	        ArrayList<Integer>list=new ArrayList<>();
	        int left=N<<d|N>>(16-d)&((1<<16)-1);
	        int right=N>>d|N<<(16-d)&((1<<16)-1);
	        list.add(left);
	        list.add(right);
	        return list;
	    
	}
}
