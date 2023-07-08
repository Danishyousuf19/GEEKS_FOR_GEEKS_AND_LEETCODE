import java.util.Arrays;

public class rearnge_Alternatively {
	  public static void rearrange(long arr[], int n){
	        Arrays.sort(arr);
  int l=n-1;
  int s=0;
 long max=arr[n-1]+1;
  for(int i=0;i<n;i++) {
	  if(i%2==0) {
		  arr[i]=arr[i]+arr[l]%max*max;
		  l--;
	  }
	  else {
		  arr[i]=arr[i]+arr[s]%max*max;
		  s++;
	  }
  }
for(int i=0;i<n;i++) {
	arr[i]/=max;
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
