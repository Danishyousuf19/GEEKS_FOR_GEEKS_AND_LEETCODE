
public class move_all_zeros_to_end {
	 void pushZerosToEnd(int[] arr, int n) {
		  int j = 0;
		    for (int i = 0; i < n; i++) {
		        if (arr[i] != 0) {
		            // Swap non-zero element with the current index
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		            j++;
		        }
		    }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void pushzero(int a[],int n)
	{
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) {
				a[j]=a[i];
				j++;
			}
		}
		while(j<n) {
			a[j]=0;
		}
		
	}

}
