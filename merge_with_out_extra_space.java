import java.util.Arrays;

public class merge_with_out_extra_space {
	public static void merge(long arr1[], long[] arr2, int n, int m) 
    {
        long a[]=new long[n+m];
        int k=0;
        for(int i=0;i<n+m;i++) {
        	if(i<n) {
        		a[i]=arr1[i];
        	}
        	else {
        		a[k++]=arr2[i];
        	}
        }
        Arrays.sort(a);
        int l=0;
        for(int i=0;i<n+m;i++) {
        	if(i<n) {
        		arr1[i]=a[i];
        	}
        	else {
        		arr2[l++]=a[i];
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
