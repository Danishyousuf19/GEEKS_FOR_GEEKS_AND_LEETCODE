
public class wavy_array {
	public static void convertToWave(int n, int[] a) {
        // code here
		if(n%2==0) {
			for(int i=0;i<n;i+=2) {
				swap(i,i+1 ,a);
			}
		}
		else {
			for(int i=0;i<n-1;i+=2) {
				swap(i,i+1 ,a);
			}
		}
    }
	static void swap(int a , int b,int arr[]) {
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
	}
}
