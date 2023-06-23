//the function max_val which finds the maximum 
//value of abs(i – j) * min(arr[i], arr[j]) where]
//		i and j vary from 0 to n-1. 
public class find_amx_value {
	 int max_val(int arr[], int n)
	    {
		 int i=0;int j=n-1;
		 int m=Integer.MAX_VALUE;
		 while(i<j) {
			 m=Math.max(m, Math.abs(i-j)*Math.max(arr[i], arr[j]));
		 
		 if(arr[i]<arr[j]) {
			 i++;
		 }
		 else {
			 j--;
		 }
		 
		 }
		return m;}
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
