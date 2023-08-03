import java.util.HashMap;

public class find_duplicate11 {
	 public boolean containsNearbyDuplicate(int[] a, int k) {
		 HashMap<Integer,Integer>map=new HashMap<>();
		 for(int i=0;i<a.length;i++) {
			 if(map.containsKey(a[i])&&Math.abs(i-map.get(a[i]))<=k) {
				 return true;
			 }
			 else {
				 map.put(a[i], i);
			 }
		 }
		 return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
