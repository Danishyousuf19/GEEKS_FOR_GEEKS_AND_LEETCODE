import java.util.Arrays;

public class smaller_sum {
	 public long[] not_effiient_smallerSum(int n,int arr[])
	    {
	        long a[]=new long[n];
	        for(int i=0;i<n;i++) {
	        	int x=arr[i];
	        	for(int j=0;j<n;j++) {
	        		if(arr[j]<x) {
	        			a[i]+=arr[j];
	        		}
	        	}
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < n; i++) {
//	        int x = arr[i];
//	        int index = Arrays.binarySearch(sortedArr, x); // Find the index of the largest element smaller than x
//	        if (index < 0) {
//	            index = -index - 2; // If x is not found, get the insertion point - 1
//	        }
//	        for (int j = 0; j <= index; j++) {
//	            a[i] += sortedArr[j]; // Add all elements before the index to the result array
//	        }
//	    }
	}
	 public long[] smallerSum(int n,int arr[])
	    {
	        long a[]=new long[n];
	        int sorted[]=Arrays.copyOf(arr, n);
	        Arrays.sort(sorted);
	        for(int i=0;i<n;i++) {
	        	int x=arr[i];
	        	int idx=Arrays.binarySearch(sorted, x);
	        	if(idx<0) {
	        		idx=-idx-1;
	        	}
	        	for(int j=0;j<=idx;j++) {
	        		a[i]+=sorted[j];
	        	}
	        }
	        return a;
	    }
	 public long[] smallerSum_meth3(int n,int arr[])
	    {
	  
	    int a[]=arr.clone();
	    int min=0; 
	    int k=0,x;
	        long sum[] = new long[arr.length];
	  long summ[] = new long[arr.length];
	      
	        Arrays.sort(a);
	        sum[0]=0;
	        for(int i=1;i<a.length;i++)
	        {
	            sum[i]=sum[i-1]+a[i-1];
	        }
	        for(int i=0;i<arr.length;i++){
	            
	        x=arr[i];
	    int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	 
	     
	            if (a[m] == x)
	                k = m;
	            if (a[m] < x)
	                l = m + 1;
	 
	            else
	                r = m - 1;
	        }
	        summ[i]=sum[k];
	            
	        }
	 
	        
	    
	    return summ;
	        
	    }
	        
//	  long a[] = new long[n];
//	    int sortedArr[] = Arrays.copyOf(arr, n); // Create a copy of the input array
//	    Arrays.sort(sortedArr); // Sort the copied array in ascending order
//
//	    for (int i = 0; i < n; i++) {
//	        int x = arr[i];
//	        int index = Arrays.binarySearch(sortedArr, x); // Find the index of the largest element smaller than x
//	        if (index < 0) {
//	            index = -index - 1; // If x is not found, get the insertion point
//	        }
//	        for (int j = 0; j < index; j++) {
//	            a[i] += sortedArr[j]; // Add all elements before the index to the result array
//	        }
//	    }
//	    return a;
}
