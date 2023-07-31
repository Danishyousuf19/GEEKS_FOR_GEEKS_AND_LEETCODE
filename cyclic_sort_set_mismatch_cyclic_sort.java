
public class cyclic_sort_set_mismatch_cyclic_sort {
	 public int[] findErrorNums(int[] a) {
	       int i=0;
	       while(i<a.length) {
	           int c=a[i]-1;
	           if(a[i]!=a[c]) s(a,i,c);
	           else i++;
	       }
	      
	       for(int k=0;k<a.length;k++){
	           if(a[k]!=k+1)
	           {
	               return new int []{a[k],k+1};
	           }
	       }
	       return new int []{-1,-1};
	    }
	    static void s(int a[],int i, int o){
	        int t=a[i];
	        a[i]=a[o];
	        a[o]=t;
	    }
}
