import java.util.ArrayList;

public class maintan_order {
	public void Rearrange(int a[], int n)
    {
		ArrayList<Integer> z=new ArrayList<>();
		ArrayList<Integer> x=new ArrayList<>();
	for(int i=0;i<n;i++) {
		if(a[i]<0) {
			z.add(a[i]);
		}
		else {
			x.add(a[i]);
		}
	}
	z.addAll(x);
	for(int i= 0;i<n;i++) {
		a[i]=z.get(i);
	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
