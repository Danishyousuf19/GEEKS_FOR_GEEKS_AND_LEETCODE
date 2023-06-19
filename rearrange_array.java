
public class rearrange_array {
	static void arrange(long arr[], int n)
    {
        // your code here:
 for(int i=0;i<n;i++) {
	 long orignal =arr[i];
	 long transformed =arr[(int) (arr[i])]%n;
	 arr[i]=orignal+transformed*n;
 }
 for(int i=0;i<n;i++) {
	 arr[i]=arr[i]/n;
 }
            
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	static void arrange2(long arr[], int n)
//    {
//        // your code here:
// for(int i=0;i<n;i++) {
//	 long orignal =arr[i];
//	 long transformed =arr[(int) arr[i]];
//	 arr[i]=transformed;
// }
// for(int i=0;i<n;i++) {
//	 arr[i]=arr[i]/n;
// }
//            
//        }
}
