
public class binary_search_questions {
	static int celing(int a[],int t) {
		if(t>a[a.length-1])
			return -1;
		int s=0;
		int e=a.length;
		int mid;
		while(s<=e) {
			mid=s+(e-s)/2;
			if(a[mid]==t)
				return mid;
			else if(a[mid]>t){
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return s;
	}
	static int floor(int a[],int t) {
		if(t<a[0])
			return -1;
		int s=0;
		int e=a.length;
		int mid;
		while(s<=e) {
			mid=s+(e-s)/2;
			if(a[mid]==t)
				return t;
			else if(a[mid]>t){
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
