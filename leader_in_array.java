import java.util.ArrayList;
import java.util.Collections;

public class leader_in_array {
	  static ArrayList<Integer> leaders(int arr[], int n){
		  ArrayList<Integer>list=new ArrayList<>();
		 for(int i=0;i<n;i++) {
			 int k=0;
			 for(int j=n-1;j>=i;j--) {
				 if(arr[j]<arr[i] ) 
				 {	 k++;
					 break; }
			 }
			 if(k==0)
			 list.add(arr[i]);
		 }return list;
		
	       
	    }
	  static ArrayList<Integer> leader(int arr[], int n){
		  ArrayList<Integer>list=new ArrayList<>();
			int max=arr[n-1];
			list.add(max);
			for(int i=n-2;i>=0;i++){
			    if(arr[i]>max){
			        list.add(arr[i]);
			        max=arr[i];
			    }
			    
			}
			Collections.sort(list);
			 return list;
			
		       
	    }
}
