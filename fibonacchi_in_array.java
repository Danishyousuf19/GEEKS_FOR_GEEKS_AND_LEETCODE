import java.util.Arrays;

public class fibonacchi_in_array {
	static void makefib (long n[],int i){
		if(i>=n.length) {
			return;
		}
		if(i==0|i==1) {
			n[i]=i;
		}
		else {	n[i]=n[i-1]+n[i-2];}
		makefib(n,i+1);
	}
	static long []getfib(int n){
		long helper[]=new long [n];
		makefib(helper,0);
		return helper;
	}
	static int checkFib(long arr[] ,int N)
    {int c=0;
    long[] h=getfib(N);
       {
        	for(int i=0;i<N;i++) {
        		for(int j=0;j<N;j++) {
        			if((arr[i]==h[j])) {
        				c++;break;
        			}
        		}
        	}
        }
        return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long h[]=getfib(5);
		for(long E:h) {
			System.out.println(E+" ");
		}
		long h3[]= {13,1,1,3,4,5};
		System.out.println(checkFib(h3,5));
	}
//	0 1 1 2 3 5 8 13 21 34
}
