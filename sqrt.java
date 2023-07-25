
public class sqrt {

	static double sqrt (int n,int p) {
		double root=0.0;
		int s=0;int e=n;
		while (s<=e){
			int mid=s+(e-s)/2;
			if(mid*mid==n) {
				return mid;
			}
			else if(mid*mid>n) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		double inc=.1;
		for(int i=0;i<p;i++) {
			while(root*root<=n) {
				root+=inc;
			}
			root-=inc;
			inc/=10;
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=40;
int p=3;
System.out.println(sqrt(n,p));
System.out.println(Newtonsqrt(40));
	}
	static double Newtonsqrt (double n) {
		double x=n;
		double root;
		while(true) {
			root=.5*(x+n/x);
			if(Math.abs(root-x)<.5) {
				break;
			}
			x=root;
		}
		
		return root;
	}
	

}
