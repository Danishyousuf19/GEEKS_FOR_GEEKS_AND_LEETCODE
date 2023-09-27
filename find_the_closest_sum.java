import java.util.ArrayList;

public class find_the_closest_sum {
	public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
		ArrayList<Integer> list=new ArrayList<>();
		int l=0;int r=m-1;
		int diff=Integer.MAX_VALUE;
		while(l<n&&r>=0) {
			int sum=arr[l]+brr[r];
			int curr=Math.abs(sum-x);
			if(curr<diff) {
				diff=curr;
				list.clear();
				list.add(arr[l]);
				list.add(brr[r]);
			}
			if(sum<x) {
				l++;
			}
			else {
				r--;
			}
		}
		return list;
    }
}
