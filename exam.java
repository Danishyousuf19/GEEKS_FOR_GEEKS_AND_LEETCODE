import java.util.ArrayList;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,9,-3,1};
		int target=5;
//		System.out.print(index(arr,4,target).toString());
		System.out.print(secmax(arr,5));

	}
	static ArrayList<Integer>   index(int arr[],int n ,int sum) {
		ArrayList<Integer>ans=new ArrayList<>();
		int cs=0;
		for(int i=0;i<n;i++) {
			if(cs+arr[i]<=sum) {
				cs+=arr[i];
				ans.add(i);
				
			}
			if(cs==sum ) {
				return ans;
			}
		}
		
		return ans;
	}
	static int secmax(int arr[],int n) {
		int max1=arr[0];
		int max2=arr[1];
		int tep=max1;
		max1=Math.max(max1, max2);
		max2=Math.min(tep, max2);
		for(int i=2;i<n;i++) {
			if(arr[i]>=max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>=max2) {
				max2=arr[1];
			}
		}
		return max2;
	}

}
