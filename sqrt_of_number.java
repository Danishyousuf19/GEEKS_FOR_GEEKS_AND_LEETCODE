
public class sqrt_of_number {
	 long floorSqrt(long x)
	 {
		 if(x==0|x==1) {
			 return x;
		 }
	long s=1;
	long e=x;
	
	while(s<=x) {
		long mid=s+(e-s)/2;
		if(mid==x/mid) {
			return mid;
		}
		else if(mid>x/mid) {
			e=mid-1;
		}
		else {
			s=mid+1;
		}
	}
	return e;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
