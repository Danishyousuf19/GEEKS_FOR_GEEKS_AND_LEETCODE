import java.util.ArrayList;

public class odd_even_position {
	 ArrayList<Long> arrangeOddAndEven(long a[], int n)
	    {

	 ArrayList<Long> evenLst = new ArrayList<>();
	     ArrayList<Long> oddLst = new ArrayList<>();
	     ArrayList<Long> res = new ArrayList<>(n);
	     for(int i=0;i<n;++i) {
	         if(a[i] % 2 == 0) {
	             evenLst.add(a[i]);
	         }
	         else {
	             oddLst.add(a[i]);
	         }
	     }
	     int i = 0, j = 0;
	     while(i < evenLst.size() && j < oddLst.size()) {
	         res.add(evenLst.get(i));
	         ++i;
	         res.add(oddLst.get(j));
	         ++j;
	     }
	     while(i < evenLst.size()) {
	         res.add(evenLst.get(i));
	         ++i;
	     }
	     while(j < oddLst.size()) {
	         res.add(oddLst.get(j));
	         ++j;
	     }
	     return res;
	 }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
