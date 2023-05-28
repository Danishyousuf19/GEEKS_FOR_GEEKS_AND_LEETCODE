import java.util.Arrays;
 
public class sum_of_distinct {
	
	 static int findSum(int arr[], int n) {
		 int sum=0;
	        Arrays.sort(arr);
	        for(int i=0;i<n;i++) {
	        	for (int j=0;j<n;j++) {
	        		if(j==i) {
	        			continue;
	        		}
	        		else if(arr[i]==arr[j]){
	        			arr[i]=0;
	        		}
	        	}sum+=arr[i];
	        }
	        return sum;
	    }
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,3};
		System.out.println(findSum(a,6));
		}
	//other way efficient
//	 int findSum(int arr[], int n) {
//	      
//		        Arrays.sort(arr);  int sum=arr[0];
//		        for(int i=1;i<n;i++) {
//		        if(arr[i]!=arr[i-1])
//		        sum+=arr[i];
//		        }
//		        return sum;
//	    }
}
