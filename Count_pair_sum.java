//Count pair sum
//Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
//Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.
public class Count_pair_sum {
	 // value 
    static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
	 { 
	 int c=0;
     for (int i=0;i<M;i++) {
     	for (int j=0;j<N;j++) {
     	if(arr1[i]+arr2[j]==x) {
     		c++;
     	}
     }}
     return c;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
