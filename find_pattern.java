import java.util.HashMap;

public class find_pattern {
	 public static int NthTerm_rec(long n)
	    {  
		 if(n==1||n==2) 
			 return 1;
			 return (NthTerm_rec(n-1)*2+NthTerm_rec(n-2)*5)	;
			 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(NthTerm_rec(4));
System.out.println((int)(390878553));
	}
	
	

}
class Solution
{HashMap <Long,Integer>a=new HashMap<>();
    public int NthTerm(long n)
    { 
          
		 if(n==1||n==2) 
			 return 1;
			 if(a.containsKey(n)) 
				 return a.get(n);
			 
			int res=  (NthTerm(n-1)*2+NthTerm(n-2)*5)	;
			 a.put(n, res);
			 if(res<0) {
				 return Integer.MAX_VALUE-res;
			 }
			 return res;
	    
    }
}