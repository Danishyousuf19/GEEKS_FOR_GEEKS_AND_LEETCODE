import java.util.*;

public class missing_all_no {
//assume 1 to n;
	 public List<Integer> findDisappearedNumbers(int[] n) {
	        List<Integer>a=new ArrayList<>();
	        //cyclic sort
	        int i=0;
	        while(i<n.length) {
	        	int corr=n[i]-1;
	        	if(n[i]!=n[corr]) {
	        		//swap
	        		swap(n,i,corr);
	        	}
	        	else {
	        		i++;
	        	}
	        }
	        for(int j=0;j<n.length;j++) {
	        	if(n[j]!=j+1)a.add(n[j]);
	        }
	        return a;
	    }
	 static void swap(int a[],int i,int j) {
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
