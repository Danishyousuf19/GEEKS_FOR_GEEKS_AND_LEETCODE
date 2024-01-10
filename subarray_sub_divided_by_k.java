import java.util.HashMap;

public class subarray_sub_divided_by_k {
	 int longSubarrWthSumDivByK(int arr[], int n, int k)
	    {
	        // Complete the function
	       int ans=0,sum=0;
	       HashMap<Integer,Integer>map=new HashMap<>();
	       map.put(0,-1);
	       for(int i=0;i<n;i++){
	           sum+=arr[i];
	           int r=sum%k;
	           if(r<0)r+=k;
	           if (!map.containsKey(r)) map.put(r, i);
	           else ans=Math.max(ans,i-map.get(r));
	       }
	       return ans;
	    }
}
