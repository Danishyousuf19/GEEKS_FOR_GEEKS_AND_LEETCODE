import java.util.Arrays;

public class Reverse__ktimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};int k=2;
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	static void reverse(int arr[],int s,int e) {
		while(s<e) {
			int t=arr[s];
			arr[s]=arr[e];
			arr[e]=t;
			s++;
			e--;
		}
		
	}

}
