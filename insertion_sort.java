
public class insertion_sort {
	 static void insert(int arr[],int i)
	  {int current=arr[i];
	  int j=i-1;
	  while(j>=0&current<arr[j]) {
		  //push;
		  arr[j+1]=arr[j];
		  j--;
	  }
	  arr[j+1]=current;
	       // Your code here
	  }
	  //Function to sort the array using insertion sort algorithm.
	  public void insertionSort(int arr[], int n)
	  {for(int i=0;i<n-1;i++) {
		  insert(arr,i);
		  
		  
	  }
	      //code here
	  }
//	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
