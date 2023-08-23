
public class int_to_roman {
	 public String intToRoman(int num) {
	        String ans="";
	        int key[]=  {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String val[]= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        	for(int i=0;i<key.length;i++) {
	        		while(num>=key[i]) {
	        			ans+=val[i];
	        			num-=key[i];
	        		}
	        	}
	        
	        return ans;
	    }
}
