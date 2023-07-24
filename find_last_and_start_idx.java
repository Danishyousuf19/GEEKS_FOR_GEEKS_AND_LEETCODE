import java.util.ArrayList;

public class find_last_and_start_idx {
	 public int[] searchRange(int[] nums, int target) {
	        int []ans= {-1,-1};
	        ans[0]=binary_search(nums,target,true);
	        ans[1]=binary_search(nums,target,false);
	        return ans;
	    }
	 int binary_search(int a[],int t,boolean search_first) {
		  int ans=-1;
		  int s=0;
		  int e=a.length-1;
		  while(s<=e) {
			  int m=s+(e-s)/2;
			  if(a[m]>t) 
				  e=m-1;
			  else if(a[m]<t)
				  s=m+1;
			  else {
				  ans=m;
				  if(search_first)
					  e=m-1;
				  else
					  s=m+1;
			  }
		  }
		  return ans;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 ArrayList<Long> find(long arr[], int n, int x)
	    {
	        ArrayList<Long>a=new ArrayList<>();
	        a.add(bin(arr,x,true));
	        a.add(bin(arr,x,false));
	        return a;
	    }
	 static long bin(long a[],int t,boolean search_first) {
		 long ans=-1;
		 int s=0;int e=a.length-1;
		 while(s<=e) {
			 int m=s+(e-s)/2;
			 if(a[m]>t)
				 e=m-1;
			 else if(a[m]<t)
				 s=m+1;
			 else {
				 ans=m;
				 if(search_first) 
					 e=m-1;
					 else
						s=m+1; 
			 }
		 }
		 return ans;
	 }

}
