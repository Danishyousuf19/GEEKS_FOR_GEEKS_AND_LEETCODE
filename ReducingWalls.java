
public class ReducingWalls {
	 public static int ReducingWalls (int arr[], int n, int k) {
	        int count =0;
	        for (int i=0;i<n;i++) {
	        	int temp=arr[i];
	        	if(temp<=k)
	        		continue;
	        	else 
	        	{
	        		while (temp>k) {
	        			temp-=k;
	        			count++;
	        		}
	        	}
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
