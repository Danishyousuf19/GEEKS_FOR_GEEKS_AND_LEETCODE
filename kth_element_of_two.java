import java.util.ArrayList;

import java.util.Collections;

public class kth_element_of_two {
	 public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
	        ArrayList <Integer>list=new ArrayList<>();
	        for(int i=0;i<n;i++) {
	        	list.add(arr1[i]);
	        } 
	        for(int i=0;i<m;i++) {
	        	list.add(arr2[i]);
	        }
	        Collections.sort(list);
	        return list.get(k-1);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
