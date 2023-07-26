
public class no_of_times_array_is_rotated {
static int pivot(int a[]) {
	int l=0;
	int h=a.length-1;
	int m;
	while(l<h) {
		m=l+(h-l)/2;
		if(a[m]>a[h]) {
			l=m+1;
		}
		else if(a[m]<a[h]) {
		 h=m;
		 }
		else {
			h--;
		}
	}
	return l;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,1};
System.out.println(pivot(a));
	}

}
