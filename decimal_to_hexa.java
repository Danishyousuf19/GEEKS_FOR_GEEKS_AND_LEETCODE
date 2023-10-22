
public class decimal_to_hexa {
	 public String toHex(int num) {
	        StringBuilder sb=new StringBuilder();
	        if(num==0)return "0";
         long n=num;
          if(num < 0){
        n =(long)(Math.pow(2,32) + num);
     }
	        while(n!=0) {
	        	int r=(int)(n%16);
	        	if(r<10)sb.append(r);
	        	else sb.append((char)(r+87));
	        	n/=16;
	        }
	        return sb.reverse().toString();
	    }
}
