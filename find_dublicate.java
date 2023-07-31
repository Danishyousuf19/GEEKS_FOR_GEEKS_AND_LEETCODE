
public class find_dublicate {
	public int findDuplicate(int[] a) {
        int i=0;
        while(i<a.length){
            int corr=a[i]-1;
            if(a[i]!=a[corr])
            swap(a,i,corr);
            else i++;
        }
        // System.out.print(Arrays.toString(a));
        int t=0;
        for(int ii=0;ii<a.length;ii++){
            if(a[ii]!=ii+1)
         return a[ii];
        }
        return t;

    }
    static void swap(int a[],int x,int y){
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
    public int Simple(int[] a) {
        int i=0;
        while(i<a.length){
        	if(a[i]!=i+1) {
        		int corr=a[i]-1;
        		if(a[i]!=a[corr])
        			swap(a,i,corr);
        		else
        			return i+1;
        		}
        	else 
        	    i++;
            
        }
        return -1;
    }
    
}
