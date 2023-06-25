import java.util.Arrays;

public class sort_2_poiinter {
	 public static void Rearrange(int a[], int n, int answer[])
	    {
	        Arrays.sort(a);
	
	        int i=0;int j=n-1;
	        int k=0;
	        while(k<n) {
	        	if(i<(n+1)/2) {
	        	answer[k]=a[i];i++;}
	        	k++;
	        	if(j>=(n+1)/2){
	        	answer[k]=a[j];j--;}
//	        	System.out.println(i+" i  j "+j+ "ans"+ Arrays.toString(answer));
	        	k++;
	        	
	        	
	        }
	        System.out.println(Arrays.toString(answer));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]=new int[5];
int a[]= {4,5,1,2,3};
Rearrange(a,5,b);

	}

}
