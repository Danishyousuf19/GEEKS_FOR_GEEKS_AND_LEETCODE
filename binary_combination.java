
public class binary_combination {
	 long countStrings(int n) {
	        // code here
	       long prev=2l,prev2=1l;
	       for(int i=2;i<=n;i++){
	           long curr=(prev+prev2)%1000000007;
	           prev2=prev;
	           prev=curr;
	       }
	       return  prev;
	    }
	 long countStrhings(int n) {
	        // code here
	        return solve("", 0, n);}
	    long solve(String cur, int i, int n){
	        if(i==n) return 1l;
	        long res = 0l;
	        
	        if(i==0 || cur.charAt( i-1 ) == '0'){
	            res += solve(cur+'1', i+1, n);
	        }
	        res += solve(cur+'0', i+1, n);
	        
	        return res;
	    }
}
