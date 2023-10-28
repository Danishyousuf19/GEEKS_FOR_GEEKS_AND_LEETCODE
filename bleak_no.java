
public class bleak_no {
	public int is_bleak(int n)
    {for(int i=1;i<=30;i++)
    {
        
        int rem = n-i;
        if(rem<0) break;
        int cnt = Integer.bitCount(rem);
        
        if(cnt==i) return 0;
    }
    
    return 1;}
}
