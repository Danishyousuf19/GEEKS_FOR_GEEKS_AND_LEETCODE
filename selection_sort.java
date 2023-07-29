import java.util.Arrays;

public class selection_sort {
static void sort(int a[]) {
	for(int i=0;i<a.length;i++) {
		int max=0;
		for(int j=0;j<a.length-i;j++) {
			if(a[j]>a[max])
				max=j;
		}
		int temp=a[a.length-i-1];
		a[a.length-i-1]=a[max];
		a[max]=temp;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int aa[]= {1,42,2,5,4};
sorting(aa);
System.out.println(Arrays.toString(aa));
	}
	static void sorting(int a[]) {
		for(int i=0;i<a.length;i++) {
			int l=a.length-i-1;
			int m=max(a,0,l);
			swap(a,m,l);
		}
	}
	static int max(int a[],int s,int e) {
		int max=s;
		while(s<=e) {
			if(a[s]>a[max])
				max=s;
			s++;
		}
		return max;
	}
	static void swap(int a[],int f,int s) {
		int t=a[f];
		a[f]=a[s];
		a[s]=t;
	}

}
