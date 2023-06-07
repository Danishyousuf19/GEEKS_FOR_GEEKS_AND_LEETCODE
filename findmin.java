import java.util.Arrays;

public class findmin {
	 int Easy_wayfindMin(int arr[], int n)
	    {
	       Arrays.sort(arr);
	       return arr[0];
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
	 int sort_findMin(int arr[], int n)
	    {int l=0;int h=n-1;
	    
		 int mid=(l+h)/2;
		 while(l<h)
		 {mid =l+(h-l)/2;
		 if(arr[mid]<=arr[h])
		 {
			 h=mid;
		 }else {
			 l=mid+1;
		 }
			 
		 }
		 return arr[l];
	    }
}
