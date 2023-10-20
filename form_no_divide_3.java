
public class form_no_divide_3 {
	 static int isPossible(int N, int arr[]) {
	        // code here
		 int sum=0;
		 
		 for(int i=0;i<N;i++) {
			sum+=find(arr[i]); 
		 }
		 return sum%3==0?1:0;
	    }
	static int find(int i) {
		int s=0;
		while(i!=0){
			s+=i%10;
			i/=10;
		}
		return s;
	}
}
