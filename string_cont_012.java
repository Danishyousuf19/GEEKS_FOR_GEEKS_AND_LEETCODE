
public class string_cont_012 {
	 public int smallestSubstring(String s) {
	        // Code here
	        int ans=-1;
	        int n=s.length();
	        int zi=-1,oi=-1,ti=-1;
	        for(int i=0;i<n;i++){
	            if(s.charAt(i)=='0')zi=i; 
	            if(s.charAt(i)=='1')oi=i;
	            if(s.charAt(i)=='2')ti=i;
	            if(zi!=-1&&oi!=-1&&ti!=-1){
	                int min=Math.min(zi,Math.min(oi,ti));
	                int max=Math.max(zi,Math.max(oi,ti));
	                    ans = ans==-1 ? max-min+1 : Math.min(ans,max-min+1);
	            }
	        }
	        return ans;
	    }
}
