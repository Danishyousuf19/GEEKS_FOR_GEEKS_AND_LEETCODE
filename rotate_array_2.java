
public class rotate_array_2 {
	 static void rotateArr(int arr[], int d, int n)
	    {d=d%n;
	        reverse(arr,0,d-1);
	        reverse(arr,d,n-1);
	        reverse(arr,0,n-1);
	        
	    }
	 static void reverse(int a[],int s,int e) {
		 while(s<e) {
			 int t=a[s];
			 a[s]=a[e];
			 a[e]=t;
			 s++;
			 e--;
					 
		 }
	 }
}
