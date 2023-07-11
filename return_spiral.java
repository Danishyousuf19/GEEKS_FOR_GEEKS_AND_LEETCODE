
import java.util.*;
public class return_spiral {
	class Solution {
	    public List<Integer> spiralOrder(int[][] m) {
		        List <Integer>a=new ArrayList<>();
						      
	        if(m == null || m.length == 0) {
	            return a;
	        }

		        int l=m.length;
		        int b=m[0].length;
		        int rl=0,ru=m.length-1,cl=0,cu=m[0].length-1;
		      
		        while(rl<=ru&&cl<=cu) {
		        	for(int i=cl;i<=cu;i++) {
		        	
		        		a.add(m[rl][i]);
		        	}
		        	rl++;
		        	for(int i=rl;i<=ru;i++) {
		        	
		        		a.add(m[i][cu]);
		        	}
		        	cu--;
//		        	moving left
							if(rl<=ru){
		        	for(int i=cu;i>=cl;i--) {
		        
		        		a.add(m[ru][i]);
		        	}
		        	ru--;}
//							moving up
							if(cl<=cu){
		        	for(int i=ru;i>=rl;i--) {
		        	
		        		a.add(m[i][cl]);
		        	}
		        	cl++;}
		        }
		        
		        
		        return a;

		    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
