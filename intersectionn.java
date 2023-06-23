import java.util.HashSet;

public class intersectionn {
	public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
		int s=m+n;
        HashSet <Integer>x=new HashSet<>();
          int k=0;
        for(int i=0;i<n;i++) {
        x.add(a[i]);
        }
        for(int i=0;i<m;i++) {
        	
        if(x.contains(b[i])){
        	k++;
        	x.remove(b[i]);
        }
        }
        return k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
