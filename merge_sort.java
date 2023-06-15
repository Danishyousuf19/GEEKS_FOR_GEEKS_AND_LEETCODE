
public class merge_sort {
	 void merge(int arr[], int l, int m, int r)
	    {
	         int mrg[]=new int [r-l+1];
	         int i1=l;
	         int i2=m+1;
	         int x=0;
	         while(i1<=m&i2<=r) {
	        	 if(arr[i1]<=arr[i2]) {
	        		 mrg[x++]=arr[i1++];
	        		 mrg[x++]=arr[i2++];
	        	 }
	         }
	         while(i1<=m) {
	        	 mrg[x++]=arr[i1++];
	         }
	         while(i2<=r)
	         {mrg[x++]=arr[i2++];
	         }
	        		 for(int i=0,j=l;i<mrg.length;j++,i++) {
	        			 arr[j]=mrg[i];
	        		 }
	        	 
	    }
	    void mergeSort(int arr[], int l, int r)
	    {
	int mid =l+(r-l)/2;
	mergeSort(arr,l,mid);
	mergeSort(arr,mid+1,r);
	merge(arr,l,mid,r);
	if(l>=r) {
		return;
	}
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
