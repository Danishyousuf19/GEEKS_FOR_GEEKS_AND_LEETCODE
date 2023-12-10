import java.util.HashSet;

public class ccan_make_sum_0 {
	 static boolean findsum(int arr[],int n)
	    {
	        //Your code here
	        HashSet<Integer>already=new HashSet<>();
	        int s=0;
	        for(int i=0;i<n;i++){
	            s+=arr[i];
	            if(s==0||arr[i]==0||already.contains(s))return true;
	            already.add(s);
	        }
	        return false;
	    }
}
