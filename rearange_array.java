import java.util.ArrayList;

public class rearange_array {
	ArrayList<Long> arranged(long a[], int n)
    {
		ArrayList<Long> z=new ArrayList<>();
		ArrayList<Long> x=new ArrayList<>();
		ArrayList<Long> y=new ArrayList<>();
  for(int i=0;i<n;i++) {
	  if(a[i]<0) {
		  x.add(a[i]);
	  }
	  else {
		  y.add(a[i]);
	  }
  }
  int j=0;
  for(int i=0;i<y.size();i++) {
	  z.add(y.get(j));
	  z.add(x.get(i));
	  j++;
  }

return z;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
