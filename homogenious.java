
public class homogenious {
public int countHomogenous(String s) {
    long res=0;
    int l=0;int r;
    for(r=0;r<s.length();r++) {
    	if(s.charAt(r)==s.charAt(l)) {
    		res+=(r-l)+1;
    	}
    	else {
    		r++;
    		l=r;
    	}
    }
    
    return (int) (res % (1000000007)); 
}
}
