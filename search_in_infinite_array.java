
public class search_in_infinite_array {
	static int infinte(int a[],int t) {
		int s=0;
		int e=1;
		while(t>a[e]) {
			int temp=e+1;
			e=e+(e-s+1)*2;
			s=temp;
		}
		return bin(a,t,s,e);
	}
static int bin(int a[],int t,int s,int e) {
	while(s<=e) {
		int m=s+(e-s)/2;
		if(a[m]==t)
			return m;
		else if(a[m]>t)
			e=m-1;
		else
			s=m+1;
	}
	return -1;
}
public static void main(String[] args) {
	 int[] a = { 1, 3, 5, 7, 9, 11, 13, 15 }; // Sample sorted infinite array
     int target = 7;
	System.out.println(infinte(a,15));
}
}
