
public class fibonacci {
	 
	  public static long[] printFibb(int n) 
	    {if (n<1)return new long[] {};
	        if(n==1) return new long[]{1};
	    long a[]=new long[n];
	    a[0]=1;a[1]=1;
	       for(int i=2;i<n;i++){
	           a[i]=a[i-1]+a[i-2];
	       }
	       return a;
	    }
	    
}
