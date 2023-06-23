import java.util.ArrayList;
import java.util.Collections;

public class union_of_sotted {
	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
         ArrayList<Integer> a=new  ArrayList<>();
         for(int i=0;i<n;i++) {
        	 if(!a.contains(arr1[i]))
        	 a.add(arr1[i]);
         }
         for(int i=0;i<m;i++) {
        	 if(!a.contains(arr2[i]))
        	 a.add(arr2[i]);
         }
         Collections.sort(a);
         return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
