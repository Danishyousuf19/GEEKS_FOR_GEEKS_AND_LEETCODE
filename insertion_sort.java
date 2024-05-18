import java.util.Arrays;

public class insertion_sort {
	
	  //Function to sort the array using insertion sort algorithm.
	  public static void insertionSort(int arr[], int n)
	  {for(int i=1;i<n;i++) {
		  int curr=arr[i];
		  int j=i-1;
		  while(j>=0&&curr<arr[j]) {
			  arr[j+1]=arr[j];
			  j--;
		  }
		  arr[j+1]=curr;
		  
		  
	  }
	      //code here
	  }
//	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		Runtime.getRuntime().totalMemory();
		int aa[]= {1,42,2,5,4};
		insertionSort(aa,5);
		System.out.println(Arrays.toString(aa));
	}
	static void sort(int[] a) {
		for (int i=0;i<=a.length-2;i++) {
			for(int j=i+1;j>0;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j,j-1);
				}
				else {
					break;
				}
			}
		}
	}
	static void swap(int a[],int s,int e) {
		int t=a[s];
		a[s]=a[e];
		a[e]=t;
	}

}
