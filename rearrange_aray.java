import java.util.Arrays;

public class rearrange_aray {
	 public static int[] Rearrange (int arr[], int n) {  
	        for(int i=0;i<n;) {
	        	if(arr[i]!=i&arr[i]!=-1) {
	        		int t=arr[arr[i]];
	        		arr[arr[i]]=arr[i];
	        		arr[i]=t;
	        	}
	        	else {
	        	++i;
	        	}
	        }
	        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,-1,-2,6};
System.out.println(Arrays.toString(Rearrange(arr,7)));

	}

}
