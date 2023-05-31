
public class Multiply_left_and_right_array_sum {
	public static int multiply (int arr[], int n) {
        //Complete the function
		int m=n/2;
		int i=0;int j=n-1;
		int s1=0,s2=0;
		while(j>=m) {
			if(i<m) {
			s1+=arr[i];
			
			}
			s2+=arr[j];
			
			i++;j--;
		}
		return s1*s2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {4,5,6};
	System.out.println(multiply(a,3));
	}

}
