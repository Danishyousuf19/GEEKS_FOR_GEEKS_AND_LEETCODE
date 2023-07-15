import java.util.*;

public class count_less_or_equal {
	public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    { ArrayList<Integer> count =new  ArrayList<>();
    
    Arrays.sort(arr2);
    for(int i=0;i<m;i++) {
    	count.add(helper(arr1[i],arr2));
    	
    }
       // add your code here
    return count;
    }
	public static int  helper(int a,int a2[]) {
		int low=0;
		int high=a2.length-1;int mid;
		
		while(low<=high) {
			mid=low+(high-low)/2;
			if(a2[mid]<=a) {
				
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
