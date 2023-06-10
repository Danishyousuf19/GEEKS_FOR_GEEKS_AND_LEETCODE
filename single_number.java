
public class single_number {
static int single(int arr[],int n) {
	int ans =0;
	for(int i=0;i<n;i++) {
		ans= ans^arr[i];
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
