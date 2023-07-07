
public class trinary_search {
	 static int ternarySearch(int arr[], int N, int K)
	    {
		 int l=0;
		 int r=N-1;
		 int mid1=l+(r-l)/3;
		 int mid2=r-(r-l)/3;
		 while(l<=r) {
			 mid1=l+(r-l)/3;
			 mid2=r-(r-l)/3;
			 if(arr[mid1]==K||arr[mid2]==K) {
				 return 1;
			 }
			 else if(K<arr[mid1]) {
				 r=mid2-1;
			 }
			 else if(K>arr[mid2]) {
				 l=mid2+1;
			 }
			 else {
				 l=mid1+1;
				 r=mid2-1;
			 }
		 }
		 
	     return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
