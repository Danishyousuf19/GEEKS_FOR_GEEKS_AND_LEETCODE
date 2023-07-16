import java.util.Arrays;

public class merge_arrry {
public void merge1(int[] nums1, int m, int[] nums2, int n) {
	
	for(int j=0,i=m;j<n;j++) {
		nums1[i++]=nums2[j];
	}
	Arrays.sort(nums1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void merge(int[] a, int m, int[] b, int n) {
		int i=m-1,j=n-1,k=m+n-1;
		while(i>=0&&j>=0) {
			if(a[i]>b[j]) {
				a[k--]=a[i--];
			}
			else {
				a[k--]=b[j--];
			}
		}
		
	}

}
