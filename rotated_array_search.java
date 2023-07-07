
public class rotated_array_search {
	 
	 static int search(int a[], int l, int h, int k)
	    {
		  while(l<=h) {
			  int mid=l+(h-l)/2;
			  if(k==a[mid]) {
				  return mid;
			  }
			  //lefted part sorted
			  if(a[l]<=a[mid]) {
			  if(k>=a[l]&&k<a[mid]) {
				 h=mid-1; 
			  }
			  else {
				  l=mid+1;
			  }
			  }
			  else {
				  if(k>a[mid]&&k<=a[h]) {
					  l=mid+1;
				  }
				  else {
					  h=mid-1;
				  }
			  }
		  }
	        // l: The starting index
	        // h: The ending index, you have to search the key in this range
	        // Complete this function
		  return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,1};
System.out.println(search(a,0,1,1));
	}

}
