
public class hindex {
public int hIndex(int[] cit) {
        int c=0;
        int n=cit.length;
        int bucket[]=new int[n+1];
        for(int p:cit) {
        	if(p>=n)bucket[n]++;
        	else bucket[p]++;
        }
        for(int i=n;i>=0;i--) {
        	c+=bucket[i];
        	if(c>=i)return i;
        }
        return c;
    }
}
