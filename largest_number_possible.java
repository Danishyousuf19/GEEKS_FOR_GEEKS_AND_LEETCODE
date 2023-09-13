
public class largest_number_possible {
	  static String findLargest(int n, int s){
		  if(s==0&&n>0)return "-1";
		  if(s>n*9)return "-1";
		  if(s==0&&n==1)return "0";
		  StringBuilder sb=new StringBuilder();
		  for(int i=0;i<n;i++) {
			  if(s>=9) {
				  sb.append(9);
				  s-=9;
			  }
			  else {
				  sb.append(s);
			  }
		  }
			 return sb.toString(); 
	        
	    }
}
